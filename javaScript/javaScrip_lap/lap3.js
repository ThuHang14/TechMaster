// const myFamily = {
//     Joel: 32,
//     Fred: 44,
//     Reginald: 65,
//     Susan: 33,
//     Julian: 13
// }

// function afterNYears(obj, n) {
//     let copy = {};

//     for (let age in obj) {
//         copy[age] = obj[age] + n
//     }
//     return copy;
// }
// console.log(
//     afterNYears(myFamily, 10));


// const order = { "Shampoo": 5.99, "Rubber Ducks": 15.99 }

// function freeShip(order) {
//     let total = 0;
//     for (let productName in order) {
//         const price = order[productName];
//         total += price
//         return total >= 50;
//     }
// }

// console.log(freeShip(order));


const scores = { "A": 100, "B": 14, "C": 9, "D": 28, "E": 145, "F": 12, "G": 3, "H": 10, "I": 200, "J": 100, "K": 114, "L": 100, "M": 25, "N": 450, "O": 80, "P": 2, "Q": 12, "R": 400, "S": 113, "T": 405, "U": 11, "V": 10, "W": 10, "X": 3, "Y": 210, "Z": 23 };

function nameScore(name) {
    name = name.toUpperCase()
    for (let i = 0; i < name.length; i++) {
        const char = (name[i]);
        total = 0
        const score = scores[char];
        total += score
    }

    if (total <= 60) console.log(" NOT TOO GOO");
    else if (61 <= total && total <= 300) console.log(" PRETTY GOOD");
    else if (301 <= total && total <= 599) console.log(" VERY GOOD");
    else { console.log(" THE BEST"); }
}
nameScore("ii")

const name = { a: 810, b: 2, c: 3 };

// function invert(name) {
//     let copy = {};
//     for(let key in name){
//     let splits = name.split("");
//     let refer = splits.reverse();
//     console.log(refer);
// }}

// invert(name)



// const persons = {
//     Emma: 21,
//     Jack: 45,
//     Amy: 115,
//     Ben: 29
// }

// function oldest(persons) {
//     let result = null;
//     max = 0;
//     for (let name in persons) {
//         if (persons[name] > max) {
//             max = persons[name];
//             result = {
//                 [name]: max
//             }
//         }
//     }
//     return result;
// }

// console.log(oldest(persons));

//c1:

// function isUpper(char) {
//     return char == char.toUpperCase();
// }

// function reverseCase(str) {
//     let result = '';
//     for (let i = 0; i < str.length; i++) {
//         const char = str[i]
//         if (isUpper(char)) {
//             result += str[i].toLowerCase();
//         } else {
//             result += str[i].toUpperCase();
//         }
//     }
//     return result.split('').reverse('').join('');
// }

// console.log(reverseCase("An LLOh"));
//c2 :
// function reverseCase(str) {
//     let result = '';
//     for (let i = 0; i < str.length; i++) {
//         if (str[i].toUpperCase) {
//             result += str[i].toLowerCase();
//         } else {
//             result += str[i].toUpperCase();
//         }
//     }
//     return result.split('').reverse('').join('');
// }

// console.log(reverseCase("An LLOh"));