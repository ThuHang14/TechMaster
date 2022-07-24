const btn = document.querySelector(".btn")
const imageEL = document.querySelector(".image img")

btn.addEventListener("click", async function() {
    try {
        //api => bat dong bo

        let res = await axios.get("https://dog.ceo/api/breeds/image/random")
        console.log(res);
        // lay ket qua tu api => hien thi
        imageEL.src = res.data.message
    } catch (error) {
        console.log(error);
    }
})