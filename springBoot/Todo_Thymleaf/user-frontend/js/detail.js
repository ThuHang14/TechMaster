const nameEL = document.getElementById('name')
const emailEL = document.getElementById('email')
const phoneEL = document.getElementById('phone')
const addressEL = document.getElementById('address');
const avataEL = document.getElementById("avatar-p")

const imgEL = document.querySelector('.image-container')
const btn_img = document.getElementById('btn-modal-image')

const btn_delete_img = document.getElementById('btn-delete-image')

let params = new URLSearchParams(window.location.search);
let id = params.get("id")
console.log(id);

const URL_GET_IMG = `http://localhost:8080/api/v1/users/${id}/files`

//lay tt user
const getUser = async(id) => {
    try {
        let res = await axios.get("http://localhost:8080/api/v1/users/" + id)
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
        console.log(res);

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

const renderImg = (array) => {
    let html = ""
    imgEL.innerHTML = ""

    for (let i = 0; i < array.length; i++) {
        const img = array[i];
        html += `
            <div class="image-item">
                <img src="http://localhost:8080${img}" alt="ảnh">
            </div>
            `
    }
    imgEL.innerHTML = html
}


btn_img.addEventListener("click", async function() {
    try {
        let res = await axios.get(URL_GET_IMG)
        console.log(res.data);
        renderImg(res.data)

    } catch (error) {
        console.log(error);
    }
})

init()