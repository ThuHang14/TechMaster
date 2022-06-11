const nameEL = document.getElementById('name')
const emailEL = document.getElementById('email')
const phoneEL = document.getElementById('phone')
const addressEL = document.getElementById('address');
const avataEL = document.getElementById("avatar-p")

let params = new URLSearchParams(window.location.search);
let id = params.get("id")
console.log(id);

//


//lay tt user
const getUser = async(id) => {
    try {
        let res = await axios.get("http://localhost:8080/api/v1/users/" + id)
        nameEL.value = res.data.name
        emailEL.value = res.data.email
        phoneEL.value = res.data.phone
        addressEL.value = res.data.address
            // avataEL.location.href = res.data.img

        console.log(res);
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

init()