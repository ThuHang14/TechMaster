const tasks = [{
        id: 1,
        text: 'todo'
    },
    {
        id: 2,
        text: 'todo2'
    }
]



function createIteam(text) { //1
    const $template = $(document.querySelector('.template').content.firstElementChild).clone();

    $template.find('.text-template').text(text.text)
    $template.find('.btn-delete').on('click', function() {
        console.log("xoa " + text.id);
        //3
        deleteCreate(text.id)
    })
    return $template
}

function createList() { //2 mooix 1 obj taotạo ra 1 iteam mới 
    const list = tasks.map(function(value) {
        return createIteam(value)
    })
    return list
}

function render() { //3 
    const $list = $('.text-todo');
    const list = createList();
    
    $list.append(...list)
}


function deleteCreate(id) {
    console.log('ham xoa', id);
}


function addCreate(e) {

}

function deleteAll() {

}

$(function() {
    // render() // add task ra destop
})