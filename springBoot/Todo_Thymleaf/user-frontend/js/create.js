// https://provinces.open-api.vn/api/p/
const addressEL = document.getElementById('address');
const btnSave = document.getElementById("btn-save")
const fullNameEL = document.getElementById('fullname')
const emailEL = document.getElementById('email')
const phoneEL = document.getElementById('phone')
const pass = document.getElementById('password')
const URL_API = "http://localhost:8080/api/v1/users"

//tao user
btnSave.addEventListener("click", async function() {
    try {

        let res = await axios.post(URL_API, {
            name: fullNameEL.value,
            email: emailEL.value,
            phone: phoneEL.value,
            address: addressEL.value,
            password: pass.value
        })

        if (res.data) {
            window.location.href = "index.html"
        }

    } catch (error) {
        console.log(error);
    }
})

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


getProvinces()