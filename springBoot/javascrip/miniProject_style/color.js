$(".btn-random-color-name").click(function() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8081/random-color?type=1",
        success: function(response) {
            console.log(response);
        },
        error: function(error) {
            console.log(error);
        }
    });
});


//AOP

// const btn = document.querySelector(".btn-random-color-name");
// btn.addEventListener("click", async function() {
//     try {
//         let res = await axios.get("http://localhost:8000/random-color?type=1")
//         console.log(res);
//     } catch (error) {
//         console.log(error);
//     }
// })