// const str = `Những suy đOán xung quanh TƯƠNG lai của cầu THỦ 37 tuổi và những lời chỉ trích Anh phải nhận đã liên tục NỔ ra trong vài tuần gần đây. Nhưng Neville tin rằng vấn đề lớn nhất của Man United là hàng phòng ngự kém và thiếu nhất quán của họ: “Hàng thủ Manchester United không tốt lắm, tôi phải nói thẳng; Họ quá mâu thuẫn và không đáng tin cậy! Bạn không thể thực sự tin tưởng họ? BạN không biết điều gì sẽ xảy ra khi hỌ chơi quá lỏng lẻo`;

// function regex(str) {
//     str = str.toLowerCase();
//     str = str.replace(/à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ/g, "a");
//     str = str.replace(/è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ/g, "e");
//     str = str.replace(/ì|í|ị|ỉ|ĩ/g, "i");
//     str = str.replace(/ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ/g, "o");
//     str = str.replace(/ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ/g, "u");
//     str = str.replace(/ỳ|ý|ỵ|ỷ|ỹ/g, "y");
//     str = str.replace(/đ/g, "d");
//     str = str.replace(/\!|\?|\:|\;/g, ".")
//     return str
// }

// function getFirstSentenceContains(string, words) {
//     let str = regex(string);
//     let word = regex(words)
//     word = word.trim();
//     str = str.split('.')

//     const search = str.find(element => element.includes(word))
//     console.log(search); //réult

//     let lengthStr = search.length
//     console.log("do dai chuoi tim dc : " + lengthStr);

//     let place = str.indexOf(search)
//     console.log("vi tri str : " + place);
//     let getPlace = 0;

//     for (let i = place - 1; i >= 0; i--) {
//         getPlace += str[i].length
//     }
//     console.log("tong do dai : " + getPlace);
//     console.log("do dai ket thuc : " + getPlace + lengthStr);
//     let getString = string.slice(getPlace + place, (getPlace + lengthStr) + place)
//     console.log(getString);
// }
// getFirstSentenceContains(str, "  phòng  ");

//Date
// let now = new Date();
// console.log(now);
// console.log(new Date(2022, 0, 19, 12, 25, 6, 0));
// console.log(now.toLocaleDateString());
// console.log(now.getFullYear());

//arr
//1
// function is_array(text) {
//     return toString.call(text) === "[object Array]"
// }
// console.log(is_array('w3resource'));
// console.log(is_array([1, 2, 4, 0]));
//2

let a = 'hom naym troi ramy nang'
console.log(a.match(/m/g));