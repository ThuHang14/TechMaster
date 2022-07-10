const URL_API = "http://localhost:8080/api/v1/users"
let users = []

const tbodyEl = document.querySelector('tbody');
const searchEL = document.getElementById('search')
    // 

const renderUser = array => {
    tbodyEl.innerHTML = ""
    let html = ''

    for (let i = 0; i < array.length; i++) {
        const u = array[i];
        html += `
       <tr>
            <td>${i+1}</td>
            <td>${u.name}</td>
            <td>${u.email}</td>
            <td>${u.phone}</td>
            <td>${u.address}</td>
            <td>
                <a href="./detail.html?id=${u.id}" class="btn btn-success" onclick=detailUser(${u.id})  >Xem chi tiết</a>
                <button class="btn btn-danger" onclick=deleteUser(${u.id}) >Xóa</button>
            </td>
        </tr>
       `
    }
    tbodyEl.innerHTML = html;
}




//

const getAllUser = async() => {
    try {

        const res = await axios.get(URL_API)
        console.log(res);
        users = res.data
        renderUser(users)

    } catch (error) {
        console.log(error);
    }
}

const deleteUser = async(id) => {
    try {
        let isConfirm = confirm("Bạn có muốn xóa không?");
        if (isConfirm) {
            await axios.delete(URL_API + "/" + id)

            users.forEach((u, index) => {
                if (id == u.id) {
                    users.splice(index, 1)
                }
            });

            renderUser(users)
        }
    } catch (error) {
        console.log(error);
    }
}



searchEL.addEventListener("keydown", async function(event) {
    if (event.keyCode == 13) {

        try {
            const res = await axios.get(URL_API + "/search?name=" + searchEL.value);
            console.log("GET NAME : " + res.data);
            users = res.data


            if (users.length == 0) {
                tbodyEl.innerHTML = "<h2>khong co ket qua phu hop</h2>"
            }
            renderUser(users)
            searchEL.value = ''

        } catch (error) {
            console.log(error);
        }

    }
})

//============= IMG =====================================


getAllUser();