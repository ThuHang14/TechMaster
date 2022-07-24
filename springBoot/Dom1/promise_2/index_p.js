let money = 40;

const buyIphone = () => {
    return new Promise(function(resolve, reject) {
        if (money >= 33) {
            resolve("thanh cong")
        } else {
            reject("that bai")
        }
    })
}



const buyAirpord = () => {
    return new Promise(function(resolve, reject) {
        if (money >= 33 + 5) {
            resolve("mua them duoc airpord")
        } else {
            reject("chi mua duoc iphone")
        }
    })
}

buyIphone() //52.34
    .then(res => {
        console.log(res);
        return buyAirpord();
    })
    .then(res => {
        console.log(res);
    })
    .catch(error => { //iphone
        console.log(error)
    }) //error
    .finally(() => {
        console.log("ve nha");
    })

Promise.all([buyIphone(), buyAirpord()])
    .then(res => console.log(res))
    .catch(er => console.log(er))