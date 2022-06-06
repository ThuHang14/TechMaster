//1.48
const URL_API = "http://localhost:8080/api/v1"

let todos = [];
// Truy cập vào các thành phần
const todoListEl = document.querySelector(".todo-list");
const todoOptionItemsEl = document.querySelectorAll(".todo-option-item input")
const todoAddBtn = document.getElementById('btn-add')
const todoAddInput = document.getElementById('todo-input')

// ========= DANH SACH API ==============

// api theo trang thai 
const getTodoAPI = status => {
    switch (status) {
        case "all":
            {
                return axios.get(`${URL_API}/todos`);
            }
        case "unactive":
            {
                return axios.get(`${URL_API}/todos?status=false`);
            }
        case "active":
            {
                return axios.get(`${URL_API}/todos?status=true`);
            }
        default:
            {
                return axios.get(`${URL_API}/todos`);
            }
    }
}

//api xoa
const deleteTodoAPI = id => {
    return axios.delete(`${URL_API}/todos/${id}`);
}

//api cap nhat
const updateToDoAPI = todo => {
    return axios.put(`${URL_API}/todos/${todo.id}`, {
        title: todo.title,
        status: todo.status
    })
}

//api them moi
const createTodoAPI = title => {
    return axios.post(`${URL_API}/todos`, {
        title: title,

    })
}


// ========== HAM XU LI ==========

// Lấy danh sách todo
const getTodos = async(status = "") => {
    try {
        // Gọi API
        let res = await getTodoAPI(status);

        // Lưu lại kết quả trả về từ API
        todos = res.data;

        // Hiển thị danh sách lên giao diện
        renderTodo(todos);
    } catch (error) {
        console.log(error);
    }
}


//hien thi todo len dao dien
const renderTodo = arr => {
    // Xóa hết nội dung đang có trước khi render
    todoListEl.innerHTML = "";

    // Kiểm tra xem có todo nào trong danh sách hay không
    if (arr.length == 0) {
        todoListEl.innerHTML = "Không có công việc nào trong danh sách";
        return;
    }

    // Tạo chuỗi html
    let html = "";
    for (let i = 0; i < arr.length; i++) {
        const t = arr[i];
        html += `
            <div class="todo-item ${t.status ? "active-todo" : ""}">
                <div class="todo-item-title">
                    <input 
                        type="checkbox" ${t.status ? "checked" : ""}
                        onclick="toggleStatus(${t.id})"
                    />
                    <p>${t.title}</p>
                </div>
                <div class="option">
                    <button class="btn btn-update" onclick="updateTodo(${t.id})">
                        <img src="./img/pencil.svg" alt="icon" />
                    </button>
                    <button class="btn btn-delete" onclick="deleteTodo(${t.id})">
                        <img src="./img/remove.svg" alt="icon" />
                    </button>
                </div>
            </div>
        `
    }
    todoListEl.innerHTML = html;
}


const deleteTodo = async(id) => {
    try {
        // Xác nhận xem người dùng có muốn xóa hay không
        let isConfirm = confirm("Bạn có muốn xóa không?");

        // Nếu ok -> Xóa
        if (isConfirm) {
            // Xóa trên server
            await deleteTodoAPI(id);

            // Xóa trong mảng todos
            todos.forEach((todo, index) => {
                if (todo.id == id) {
                    todos.splice(index, 1);
                }
            })

            // Render lại giao diện
            renderTodo(todos);
        }

    } catch (error) {
        console.log(error);
    }
}

//update
const updateTodo = async(id) => {
    try {
        let todo = todos.find(t => t.id == id)
        var form = prompt("sua title", todo.title)
        console.log("update title : " + form);
        if (form == null || form == "") {
            return;
        }


        todo.title = form

        let res = updateToDoAPI(todo)
        renderTodo(todos)
    } catch (error) {
        console.log(error);
    }
}

//checked change status
const toggleStatus = async(id) => {
    try {

        let todo = todos.find(t => t.id == id)

        todo.status = !todo.status

        let res = updateToDoAPI(todo)
        console.log(res);
        renderTodo(todos)

    } catch (error) {
        console.log(error);
    }
}

// Lọc công việc theo trạng thái
// Lắng nghe sự kiện trên các ô input
todoOptionItemsEl.forEach(input => {
    input.addEventListener("change", function() {
        // Nếu ô input vào đang được chọn --> lấy ra value
        let status = input.value;

        // Gọi API để lấy công việc theo trạng thái --> hiển thị
        getTodos(status);
    })
})

// them moi toDo
todoAddBtn.addEventListener("click", function() {
    let create = createTodoAPI(todoAddInput.value)
    console.log(create);
    todos.push(create)

    todoAddInput.value = ""
    renderTodo(todos)
})

getTodos();