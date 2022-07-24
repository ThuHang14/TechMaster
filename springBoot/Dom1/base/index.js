const heading = document.getElementById("heading");
console.log(heading);



// const para2 = document.querySelectorAll(".para");
// console.log(para2[1]);

// const para2 = para2.nextElementSibling;
// console.log(para2);

const ul2 = document.querySelector("body > ul")
console.log(ul2);

const ul1 = document.querySelector(".box ul")
console.log(ul1);

const p = document.querySelectorAll("p");
console.log(p);

// for (let i = 0; i < p.length; i++) {
//     p[i].style.color = "blue";
//     p[i].style.backgroundColor = "black";
// }

Array.from(p).map(e => {
    e.style.backgroundColor = "#ccc";
})

// inner

console.log(ul1.innerHTML);
console.log(ul1.innerText);
console.log(ul1.textContent);

//set
heading.innerText = "<h5>Hello</h5>"
heading.innerHTML = "<h5>Xin chao</h5>"

// + cha
const newPara = document.createElement("p");
newPara.innerHTML = "<h1>New</h1>"
console.log(newPara);

// document.body.prepend(newPara) 
// document.body.appendChild(newPara); //cuoi

// document.body.insertBefore(newPara, ul2);

const box = document.querySelector(".box")

// document.body.insertBefore(newPara, box);

// para3.insertAdjacentElement("beforebrgin", newPara);

box.insertAdjacentHTML("beforebegin", "<p>the p </p>")

// cha => con
// document.body.removeChild(heading);
// heading.parentElement.removeChild(heading);

//update
// const link = document.createElement('a');
// link.innerText = "link google"
// link.href = "https://google.com"
// document.body.replaceChild(link, para2);

//copy
// const boxCopy1 = box.cloneNode(true)
// const boxCopy2 = box.cloneNode(false)
// console.log(boxCopy1);
// console.log(boxCopy2);
// document.body.appendChild(boxCopy1)

//classList
// box.classList.add("text-big", "text=bold")
// box.classList.remove("text-big")
// console.log(box.classList);
// console.log(box.classList.contains("text-big"));