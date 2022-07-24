const text = document.getElementById("text")

function sayHello() {
    let quotes = ["1", "2", "3"]
    let randomIndex = Math.floor(Math.random() * quotes.length);
    let randomQuote = quotes[randomIndex]

    text.innerText = randomQuote;
}

let baseString = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"];

const btn2 = document.getElementById("btn-2");
btn2.onclick = function() {
    let color1 = "#"
    for (let i = 0; i < 6; i++) {
        let letter = Math.floor(Math.random() * 16);
        color1 += baseString[letter]
    }
    console.log(color1);
    text.style.color = color1;
}

const btn3 = document.getElementById("btn-3");
btn3.addEventListener("click", function() {
    let color = "#"
    for (let i = 0; i < 6; i++) {
        let letter = Math.floor(Math.random() * 16);
        color += baseString[letter]
    }
    return text.style.backgroundColor = color;
});