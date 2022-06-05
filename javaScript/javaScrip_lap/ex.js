// //1.Đảo ngược chuỗi

// function upper(char) {
//     return char == char.toUpperCase()
// }

// function reverse(text) {
//     let result = ''
//     for (let i = 0; i < text.length; i++) {
//         const char = text[i]
//         if (upper(char)) {
//             result += char.toLowerCase();
//         } else {
//             result += char.toUpperCase();
//         }
//     }
//     return result.split(' ').reverse(' ').join(' ');
// }
// console.log(reverse("tHE fOX iS cOMING fOR tHE cHICKEN"));

// //16.Tính tuổi cha con
// function howYear(father, son) {
//     let count = 0;
//     while (father != (son * 2)) {
//         father++;
//         son++;
//         count++
//     }
//     console.log(count);
//     console.log("father " + father);
//     console.log("son " + son);

// }
// howYear(29, 3);

// //17.Bài toán gà và chó
// function countFoot() {
//     for (let i = 1; i <= 36; i++) {
//         if (2 * i + (36 - i) * 4 == 100) {
//             console.log("chicken :" + i);
//             console.log("dog :" + (36 - i));
//         }
//     }
// }
// countFoot()

// // 23. sau n năm thì những người đó bao nhiêu tuổi
// const myFamily = {
//     Joel: 32,
//     Fred: 44,
//     Reginald: 65,
//     Susan: 33,
//     Julian: 13
// }

// function afterYear(family, year) {
//     copy = {}
//     for (let key in family) {
//         copy[key] = family[key] + year
//     }
//     console.log(copy);
// }
// afterYear(myFamily, 10)

// // 24.xem đơn đặt hàng có đủ điều kiện
// const order = { "Shampoo": 55.99, "Rubber Ducks": 15.99 }

// function freeShipping(order) {
//     let result = 0
//     for (let amount in order) {
//         let copy = order[amount]
//         result += copy
//     }
//     return result > 50
// }
// console.log(freeShipping(order));

// 25.xem tên của người đó có giá trị bao nhiêu
const scores = { "A": 100, "B": 14, "C": 9, "D": 28, "E": 145, "F": 12, "G": 3, "H": 10, "I": 200, "J": 100, "K": 114, "L": 100, "M": 25, "N": 450, "O": 80, "P": 2, "Q": 12, "R": 400, "S": 113, "T": 405, "U": 11, "V": 10, "W": 10, "X": 3, "Y": 210, "Z": 23 };

// js 
// const tasks = [
//     {
//       id: 1,
//       text: 'Học jQuery',
//       completed: false,
//     },
//     {
//       id: 2,
//       text: 'Học Java Core',
//       completed: true,
//     },
//     {
//       id: 3,
//       text: 'Học Database',
//       completed: true,
//     },
//   ];

//   function createTask($template, task) {
//     const $clone = $template.clone();
//     $clone.find('.task-text').text(task.text);

//     if (!task.completed) {
//       $clone.find('.task-action').on('click', function () {
//         console.log('Hoàn thành tác vụ', task.id);
//       });
//     }

//     return $clone;
//   }

//   function createList($template, tasks) {
//     const list = [];

//     for (let i = 0; i < tasks.length; i++) {
//       const $li = createTask($template, tasks[i]);
//       list.push($li);
//     }

//     return list;
//   }

//   $(function () {
//     const $list = $('.task-list');
//     const $template = $(
//       document.querySelector('.task-item-template').content.firstElementChild
//     );

//     const list = createList($template, tasks);

//     $.each(list, function (index, $item) {
//       $item.appendTo($list);
//     });
//   });
//html

//     <style>
//       input.invalid {
//         box-shadow: 0 0 0 2px red;
//       }

//       input.invalid + .invalid-feedback {
//         display: block;
//       }

//       .invalid-feedback {
//         display: none;
//       }
//     </style>

//   <body>
//     <h1 id="heading">Hehehe</h1>
//     <ul id="list" class="task-list">
//       <template class="task-item-template">
//         <li class="task-item">
//           <img class="product-thumbnail" src="" alt="">
//           <span class="task-text"></span>
//           <button class="task-action">Done</button>
//           <div>loremdf sdf dsf sdf sdf</div>
//           <div>loremdf sdf dsf sdf sdf</div>
//           <div>loremdf sdf dsf sdf sdf</div>
//           <div>loremdf sdf dsf sdf sdf</div>
//           <div>loremdf sdf dsf sdf sdf</div>
//           <div>loremdf sdf dsf sdf sdf</div>
//         </li>
//       </template>
//     </ul>
//   </body>