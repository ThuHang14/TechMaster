const province = document.querySelector("#province")
const district = document.querySelector("#district")
const commune = document.querySelector("#commune")

async function getProvinceList() {
    try {
        let res = await axios.get("https://provinces.open-api.vn/api/p/")
            // console.log(res);
            // let res2 = await axios.get("https://provinces.open-api.vn/api/p/" + province.value + "?depth=2")
            // console.log(res2.data);
            // let res3 = await axios.get("https://provinces.open-api.vn/api/d/" + district.value + "?depth=2")
            // console.log(res3);

        //hien thi ds
        displayProvinceList(res.data)
            .then(res => {
                console.log(res);
                return displayDistrict(res2.data);
            })
            .then(res => {
                console.log(res);
            })
            .catch(error => { //iphone
                console.log(error)
            }) //error
            .finally(() => {
                console.log("ve nha");
            })


        // displayCommunet(res3.data)



    } catch (error) {
        console.log(error);
    }
}


function displayProvinceList(arr) {
    let html = ""
    for (let i = 0; i < arr.length; i++) {
        html += `<option value="${arr[i].code}"> ${arr[i].name} </option>`
    }
    province.innerHTML = html;
}

function displayDistrict(arr) {
    province.addEventListener("click", async function() {
        try {
            let html = ""
            for (let i = 0; i < arr.length; i++) {
                html += `<option value="${arr[i].code}"> ${arr[i].districts} </option>`
                district.innerHTML = html
            }

        } catch (error) {
            console.log(error);
        }

    })
}

function displayCommunet(arr) {

}

getProvinceList().then(res => console.log(res)).catch(error => console.log(error))