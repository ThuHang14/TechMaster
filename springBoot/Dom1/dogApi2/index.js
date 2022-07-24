const btn = document.querySelector("#btn")
const imageEL = document.querySelector("#image")
const selectEL = document.querySelector("#breed-list")

//api loai
async function getBreedList() {
    try {
        let res = await axios.get("https://dog.ceo/api/breeds/list/all")
        console.log(res);
        //hien thi ds
        displayBreedList(res.data.message);



    } catch (error) {
        console.log(error);
    }
}


function displayBreedList(obj) {
    let keys = Object.keys(obj);


    let html = ""
    for (let i = 0; i < keys.length; i++) {
        html += `<option value="${keys[i]}"> ${keys[i]} </option>`
    }
    selectEL.innerHTML = html;
}

getBreedList()

btn.addEventListener("click", async function() {

    try {
        //api => bat dong bo

        let res = await axios.get("https://dog.ceo/api/breed/" + selectEL.value + "/images/random")
        console.log(res);
        // lay ket qua tu api => hien thi
        imageEL.src = res.data.message
    } catch (error) {
        console.log(error);
    }
})