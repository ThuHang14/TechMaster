const tasks = load();



function createNewID(text) {
    //push vào mảng với id random
    tasks.push({
        id: Math.floor(Math.random() * 9000),
        text,
    });
    save();
    return tasks[tasks.length - 1];
}

function createItem(task) {
    // lấy ra thằng template để clone 
    const $template = $(
        document.querySelector('.task-item-template').content.firstElementChild
    ).clone();
    // trong thằng template đã clone add text mới 
    $template.find('.task-text').text(task.text);
    // trong nút thì thêm even delete 
    $template.find('.btn-delete').on('click', function() {
        deleteTask(task.id);
        $template.remove();
    });

    return $template;
}

function createList() {
    //lấy task để map hàm mới là createIteam đã viết ở ngay trên 
    const list = tasks.map(function(task) {
        return createItem(task);
    });

    return list;
}


function handleFormSubmit(e) {
    //k làm even lan tới phần khác 
    e.preventDefault();
    // lấy ra val của thẻ input và loại bỏ trim
    const $input = $('.form-text');
    const text = $input.val().trim();

    if (text.length == 0) return;
    //thằng task đã có id vừa tạo random sẽ đc add text đã lấy val ở trên input
    const newTask = createNewID(text);
    console.log(newTask);

    const $newItem = createItem(newTask);
    //sau khi lấy sẽ đc add vào list
    $('.task-list').append($newItem);


    //sau khi lấy thì val ở mục input sẽ đc set lại thành trống
    $input.val('');

    //úpdate lại number
    updateSummary();
}

function render() { // add task ra d

    const $list = $('.task-list');
    const list = createList();
    //thêm đối tượng mới vào cuối ds
    $list.append(...list);
    updateSummary();
}

function deleteTask(id) {
    const index = tasks.findIndex(function(task) {
        return task.id == id;
    });

    if (index !== -1) {
        tasks.splice(index, 1);
    }
    //local
    // localStorage.removeItem(id)
    save();

    updateSummary();
}

function updateSummary() {
    // thẻ span 
    $('.task-numbers').text(tasks.length);
}

function clearAll() {
    // set về 0 và rỗng

    tasks.length = 0;
    // localStorage.clear()
    save();


    $('.task-list').html('');
    updateSummary();
}

function load() {
    const data = localStorage.getItem('tasks')

    if (data) {
        return JSON.parse(data)
    } else {
        return []
    }
}

function save() {
    localStorage.setItem('tasks', JSON.stringify(tasks))
}
$(function() {


    // onsubmit dung trong from
    $('.task-form').on('submit', handleFormSubmit);
    //clear all
    $('.btn-clear').on('click', clearAll);
    render();
});