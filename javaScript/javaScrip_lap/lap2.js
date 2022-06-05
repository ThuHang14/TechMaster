// 1.Tính chỉ số BMI
// function findBMI(w, h) {
//     return w / (h ** 2)
// }
// let BMI = findBMI(50, 1.58);

// if (BMI <= 16) { console.log("gay do 3"); } else if (16 < BMI && BMI <= 17.5) { console.log("gay do 2"); } else if (17.5 < BMI && BMI <= 18.5) { console.log("gay do 1"); } else if (18.5 < BMI && BMI <= 25) { console.log("binh thuong"); } else if (25 < BMI && BMI <= 30) { console.log("hoi beo"); } else if (30 < BMI && BMI <= 35) { console.log("beo do 1"); } else if (35 < BMI && BMI <= 40) { console.log("beo do 2"); } else if (40 < BMI) { console.log("beo do 3"); }

// 2.Kiểm tra số lớn nhất

// function max(a, b, c) {
//     let i = a;
//     if (i > b && i > c) {
//         console.log(i = a);
//     } else if (i < b && i > c) {
//         console.log(i = b);
//     } else {
//         console.log(i = c);
//     }
// }
// max(20, 100, 100)

// 3.Tính lương cho nhân viên
// function calcSalary(hoursWork, hourlySalary) {

//     let avgHours = hoursWork / 25

//     let grossSalary = (hoursWork * hourlySalary);
//     if (avgHours >= 8) {
//         grossSalary = grossSalary + 500
//     } else if (avgHours < 8) {
//         grossSalary = grossSalary - 500
//     }
//     console.log(grossSalary);
// }

// calcSalary(119, 17)

// 4.Tính hóa đơn nước
// let m3 = 52;
// let count = 0;

// let bill5 = 45000;
// let bill10 = m3 * 9000
// let bill20 = 10 * 9000 + (m3 - 10) * 11000;
// let bill30 = bill20 + (m3 - 20) * 13000;
// let bill31 = bill30 + (m3 - 30) * 15000;

// function calcWarterBill(m3) {
//     if (m3 < 0) { return; }
//     if (m3 < 5) { return; }
//     count++;
//     return calcWarterBill(m3 - 10);

// }
// calcWarterBill(m3)
// if (count < 1) { console.log(bill5); } else if (count = 1) { console.log(bill10); } else if (count = 2) { console.log(bill20); } else if (count >= 3) { console.log(bill30); } else { console.log(bill31); }
// //

// 6.Tính tiền taxi

// function calcTaxiFee(km) {
//     if (km < 30) { console.log(km * 11 + 10000); } else { console.log(km * 9.500 + 10000); }
// }

// calcTaxiFee(20)

// 7.Tính điểm tốt nghiệp

// function calcGrade(p) {
//     if (p < 4.0) { console.log("Xếp loại F"); } else if (4.0 <= p && p < 5.5) { console.log("Xếp loại D"); } else if (5.5 <= p && p < 7.0) { console.log("Xếp loại C"); } else if (7.0 <= p && p < 8.5) { console.log("Xếp loại B"); } else { console.log("Xếp loại A"); }
// }

// calcGrade(8)

// 8.Kiểm tra năm nhuận
// function isLeafYear(y) {
//     return y % 400 == 0 || y % 4 == 0 && y % 100 != 0
// }

// console.log(isLeafYear(1200));

// 1.Viết chương trình lặp giá trị i từ 1 đến 10, với mỗi giá trị i
// for (let i = 1; i < 11; i++) {
//     if (i % 3 == 0 && i % 5 != 0) { console.log("Fizz"); } else if (i % 5 == 0 && i % 3 != 0) { console.log("Buzz"); } else if (i % 3 == 0 && i % 5 == 0) { console.log("FizzBuzz"); }
// }


// 3.Viết chương trình in ra chữ số đầu và cuối của một số n (VD: 12345 -> 15)

// function number(number) {
//     let numberString = "" + number;
//     let printNumber = (numberString.slice(0, 1)) +
//         (numberString.slice(numberString.length - 1, numberString.length));
//     console.log(printNumber);
// }

// number(1234566982)

// 7.Nhóm kín
// function gruop(name) {
//     let cutName = []
//     let setName = "" + name;

//     cutName = setName.split(' ');
//     for (let i = 0; i < cutName.length; i++) {
//         let getName = cutName[i].slice(0, 1);
//         console.log(getName);
//     }
// }

// gruop("banana mango chili")


// 8.Ký tự 
// function count(text) {
//     text = text.replace(/\s+/g, '');
//     for (i = 0; i < text.length; i++) {
//         let count = text.split(text[i]).length - 1

//         console.log(count + " " + text[i]);

//     }
// }

// count("dem so ky tu uu")