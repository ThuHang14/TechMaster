// function mimax(arr) {
//     let min = arr[0];

//     for (let i of arr) {

//         if (arr[i] < min) {
//             return min = arr[i]
//         } else {
//             return min
//         }
//     }
//     return min
// }
// console.log(
//     mimax[1, 2, 3, 4, 5]);

// let society = ["Adam", "Sarah", "Malcolm"]
//     //, 712
// function societyName(names) {
//     let sort = Object.assign([].sort)
//    let name = ''
//     let arr = names.sort();
//     for (let j of arr) {
//         arr[i] = arr[i].toUpperCase()
//     }
//     return arr.join()
// }
// societyName(society)

//3
// let arr = ["paRIE"]
// console.log(arr.length);

// function chatroomStatus(users) {
//     let lengths = users.length;
//     if (lengths == 0) {
//         console.log("No one online");
//     } else if (lengths == 1) {
//         console.log(users[0] + "  online");
//     } else if (lengths == 2) {
//         console.log(users[0] + users[1] + "  online");
//     } else {
// console.log((users[0], users[1]).join(" and ") + (lengths - 2) + " more online");
//     }
// }

// chatroomStatus(arr)
//4
// 803
//5 821
// const arr = [
//     ["m", "u", "b"],
//     ["a", "s", "h"],
//     ["i", "r", "1"]
// ]

// const idx = [1, 3, 5, 8]

// function findByIndex(arr, idx) {

//     arr = arr.join()
//     arr = arr.split(',')
//     console.log(arr);
//     for(let i of idx){

//     }

// }

// findByIndex(arr, idx)

//6
// function spelling(word) {
//     let location = 0
//     let arr = []
//     for (let i = 1; i <= word.length; i++) {
//         arr.push(word.slice(location, i));
//     }
//     return arr
// }
// console.log(spelling("happy"));
// 7 853

// function fruitSalad(fruits) {
//     let arr = []
//     for (let i of fruits) {
//         let cut = (i.length / 2).toFixed()
//         let sort = (i.slice(0, cut) + " " + i.slice(cut, i.length));
//         console.log(sort);
//         arr.push(sort).sort
//         console.log(arr);
//     }
// }
// fruitSalad(["apple", "pear", "grapes"])

//8 900
//9 23 callback

// function callback(typeofCall) {
//     console.log("call back : " + typeofCall);
// }

// function myFunction(my) {
//     if (typeof my === "function") {
//         my("hello")
//     }
// }

// myFunction(callback);

// let max = [1, 2, 3, 4, 5].sort(function(a, b) { return b - a })
// console.log(max);
// let sum = [1, 2, 3, 4, 5].reduce(function(total, value) {
//     return total += value
// })
// console.log(sum);

// let societyName = ["Adam", "Sarah", "Malcolm"].map(function(arr) {
//     return arr.slice(0, 1)
// }).sort().join('')
// console.log(societyName);

const arr = [
    { name: "John", notes: [3, 4] },
    { name: "Ben", notes: [1, 2, 3, 4] },
    { name: "Phoebe", notes: [] }
].map(function(obj) {
    return {
        name: obj.name,
        notes: obj.notes.map(function(total, values) {
            return (total += values)
        })
    }
})

console.log(arr);