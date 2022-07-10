const nameEL = document.getElementById('name')
const emailEL = document.getElementById('email')
const phoneEL = document.getElementById('phone')
const addressEL = document.getElementById('address');
const avataEL = document.getElementById("avatar-preview")

const btn_update_user = document.getElementById('btn-save')


const btn_update_pass = document.getElementById('btn-change-password')
const oldPassword = document.getElementById('old-password')
const newPassword = document.getElementById('new-password')
const forGot_Pass = document.getElementById('btn-forgot-password')

const imgEL = document.querySelector('.image-container')
const btn_img = document.getElementById('btn-modal-image')
const btn_upload_img = document.getElementById('avatar')
const img_item = document.querySelector('.image-item')



const btn_delete_img = document.getElementById('btn-delete-image')

let params = new URLSearchParams(window.location.search);
let id = params.get("id")
console.log(id);

const URL = `http://localhost:8080`

const URL_GET_USER = `http://localhost:8080/api/v1/users/${id}`
const URL_UPDATE_USER = `http://localhost:8080/api/v1/users/${id}`

const URL_UPDATE_PASS = `http://localhost:8080/api/v1/users/${id}/update-password`
const URL_FORGOT_PASS = `http://localhost:8080/api/v1/users/${id}/forgot-password`


const URL_GET_IMG = `http://localhost:8080/api/v1/users/${id}/files`
const URL_POST_IMG = `http://localhost:8080/api/v1/users/${id}/upload-file`


//lay tt user
const getUser = async(id) => {
    try {
        let res = await axios.get(URL_GET_USER)
        nameEL.value = res.data.name
        emailEL.value = res.data.email
        phoneEL.value = res.data.phone
        addressEL.value = res.data.address
            // avataEL.location.href = res.data.img
    } catch (error) {
        console.log(error);
    }
}


const getProvinces = async() => {
    try {

        let res = await axios.get("https://provinces.open-api.vn/api/p/")

        renderProvince(res.data)
    } catch (error) {
        console.log(error);
    }
}

const renderProvince = arr => {
    let html = ''
    arr.forEach(province => {
        html += `<option value="${province.name}">${province.name}</option>`
    });
    addressEL.innerHTML = html;
}

const init = async() => {
    await getProvinces()

    await getUser(id);
}

btn_update_user.addEventListener("click", async function() {
    let res = await axios.put(URL_UPDATE_USER, {
        name: nameEL.value,
        phone: phoneEL.value,
        address: addressEL.value
    })

    alert("cap nhap thanh cong")
    window.location = "index.html"

})

btn_update_pass.addEventListener("click", async function() {
    try {
        // console.log(oldPassword.value)
        // console.log(newPassword.value)

        let res = await axios.put(URL_UPDATE_PASS, {
            oldPassword: oldPassword.value,
            newPassword: newPassword.value
        })

        alert("doi pass thanh cong")
        location.reload(true)

    } catch (error) {
        alert("loi  " + error.response.data.message)
    }
})

forGot_Pass.addEventListener("click", async function() {
    try {
        let res = await axios.post(URL_FORGOT_PASS)
        alert("pass moi  " + res.data)
    } catch (error) {
        console.log(error)
    }
})

const renderImg = (array) => {
    let html = ""
    imgEL.innerHTML = ""

    for (let i = 0; i < array.length; i++) {
        const img = array[i];
        const id_img = img.slice(img.lastIndexOf("/") + 1, img.length)
        html += `
            <div class="image-item">
                <img src="http://localhost:8080${img}" alt="ảnh"
                 onclick="click_img(${id_img})" value="${img}" id="${id_img}">
            </div>
            `
    }
    imgEL.innerHTML = html
}


btn_img.addEventListener("click", async function() {
    try {
        let res = await axios.get(URL_GET_IMG)
        renderImg(res.data)
            // console.log(res)
    } catch (error) {
        console.log(error);
    }
})

btn_upload_img.addEventListener("change", async function(e) {
    let file = e.target.files[0];
    let formData = new FormData()

    formData.append('file', file)
    try {
        let res = await axios.post(URL_POST_IMG, formData)
        console.log(res)
            // renderImg(res.data)
            // window.location.reload();
    } catch (error) {
        console.log(error)
    }
})


function click_img(id_img) {
    const getImg = document.getElementById(id_img)
    getImg.parentElement.classList.add('border-danger', 'checked')
}

btn_delete_img.addEventListener("click", async function() {
    try {
        const selectEL = document.querySelector('.checked img')
        console.log(selectEL)
        await axios.delete(selectEL.src)
        window.location.reload();
    } catch (error) {

    }
})

init()