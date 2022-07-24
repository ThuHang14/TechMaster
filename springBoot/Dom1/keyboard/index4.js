// Lắng nghe sự kiện keydown
document.addEventListener("keydown", function() {
    console.log("keydown");
});

// Lắng nghe sự kiện keyup
document.addEventListener("keyup", function() {
    console.log("keyup");
});


const input = document.querySelector("input");
input.addEventListener("keydown", function(event) {
    if (event.keyCode == 13) {
        alert(input.value);
        console.log(event.target.value);
    }
})