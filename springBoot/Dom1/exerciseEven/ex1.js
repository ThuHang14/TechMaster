let btn = document.getElementById("btn")
var buttom = 0;
var left = 0;
document.addEventListener("keydown", function(e) {

    if (e.keyCode == 40) {
        buttom += 20;
        btn.style.marginTop = buttom + "px";
    } else if (e.keyCode == 38) {
        if (buttom < 0) {
            buttom = 0;
        }
        buttom -= 20;
        btn.style.marginTop = buttom + "px";
    } else if (e.keyCode == 37) {
        if (left < 0) {
            left = 0;
        }
        left -= 20;
        btn.style.marginLeft = left + "px";
    } else if (e.keyCode == 39) {
        left += 20;
        btn.style.marginLeft = left + "px";
    } else if (e.keyCode == 13) {
        document.body.appendChild(btn.cloneNode(true))

    } else if (e.keyCode == 32) {
        const square = btn.cloneNode(true);
        square.style.borderRadius = "0%"
        document.body.appendChild(square)
    } else {
        let hex = "#"
        let baseString = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"];
        for (let i = 0; i < 6; i++) {
            let num = Math.floor(Math.random() * 16);
            hex += baseString[num]
        }
        console.log(hex);
        document.body.style.background = hex;
    }

})