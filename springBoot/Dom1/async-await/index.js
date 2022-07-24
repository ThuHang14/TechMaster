let money = 33;

const buyIphone = () => {
    return new Promise(function(resolve, reject) {
        if (money >= 33) {
            resolve("thanh cong mua iphone")
        } else {
            reject("k du tien mua iphone")
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

// async function buy(){}

const buy = async() => {
    try {
        let res = await buyIphone()
        console.log(res);

        let res1 = await buyAirpord()
        console.log(res1)

    } catch (error) {
        console.log(error);
    }

    return "ve nha"
}

// console.log(buy());
buy()
    .then(res => console.log(res)) //lay ra du lieu
    .catch(er => console.log(er)) //bat loi