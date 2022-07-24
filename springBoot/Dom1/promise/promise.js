num = 10;

var promise = () => {
    return new Promise(
        function(resolve, reject) {
            if (num == 3) {
                resolve("3")
            } else {
                reject("!3")
            }

        }
    );
}

// promise
//     .then(res => console.log("res"))
//     .catch(Error => console.log("Error"))
//     .finally(console.log("end"));

promise()
    .then(res => {
        console.log(res);
    })
    .catch(error => { //iphone
        console.log(error)
    }) //error
    .finally(() => {
        console.log("ve nha");
    })