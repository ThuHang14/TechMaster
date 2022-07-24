const heading = document.getElementById('heading')
heading.style.color = "red"
heading.style.textTransform = "uppercase"

const para = document.querySelectorAll(".para")
Array.from(para).map(e => {
    e.style.color = "blue"
    e.style.fontSize = "20px"
})

const para3 = document.querySelector('.para-3')
const a = document.createElement("a")
a.innerText = "FaceBook"
a.href = "https://facebook.com"
para3.appendChild(a)

const title = document.getElementById("title")
title.innerText = "Đây là thẻ tiêu đề"

const discription = document.querySelector(".description")
discription.classList.add("text-bold")

const btn = document.createElement("button")
btn.innerText = "Click Me"
para3.parentNode.replaceChild(btn, para3)


const para2 = document.querySelector('.para-2')
para2.appendChild(para2.cloneNode(true))

document.body.removeChild(document.querySelector(".para-1"))