// alert('hhh');
console.log("x");
console.log("123");

// confirm("bbb")
// prompt("jjj")

// let name = "hh";
// let number = 1;

// const name2 = "hhh";
// const number2 = 2;

// let last2 = name2 + "aa";

// console.log("abc"+name2);
// console.log(last2);

// alert(last2);



let self = {
    name: "gg",
    favourites: [1, 2, 3],
    phone: {
        color: "black",
        battery: 98,
    },
    eat() {
        console.log("dang an");
    },
    read() {
        console.log("js");
    },
    "hello": 1,

}

// dung khi biet co key nao
console.log(self);
console.log(self.eat());
console.log(self.phone.color);

// dung khi co key dac biet 
// va khi key la 1 bien 
console.log(self["name"]);
console.log(self["eat"]());
console.log(self["phone"]["color"]);
console.log(self["hello"]);

array = [1, 2];
array[0];
let key = "hello";

console.log(self.key + "    key");
console.log(self[key] + "    [key]");



// let nhap = prompt("nhap")
// undefined
// console.log(nhap)
//  20
// undefined
// function sum(a,b){return a+b}
// undefined
// let re = sum(1,2)
// undefined
// re
// 3


let cat = {
    name: "mimi",
    eat: ["fish", "pate"],
    length: "for",
    home: {
        1: "hd",
        2: "hp"
    },
    height() {
        console.log("20cm");
    },
};

function display(obj, key) {
    if (typeof(obj[key]) == "function") {
        obj[key]();
    } else {
        console.log(obj[key]);
    }
}

// th1 :la ham thi goi ham
// th2 : in ra 
display(cat, "height");
display(cat, "eat");
display(cat, "name");