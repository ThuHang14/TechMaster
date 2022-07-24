const sum = (a, b) => a + b

function doTask1(name, callback) {
    console.log("Bắt đầu công việc");
    console.log(`Thực hiện công việc ${name}`);
    setTimeout(function() {
        callback();
    }, 3000);
}

function doTask2(name, callback) {
    console.log(`Thực hiện công việc ${name}`);
    setTimeout(function() {
        callback();
    }, 2000);
}

function doTask3(name, callback) {
    console.log(`Thực hiện công việc ${name}`);
    setTimeout(function() {
        callback();
    }, 3000);
}

function finish() {
    console.log("Kết thúc công việc");
}

doTask1("di lam", function() {
    doTask2("nghi trua", function() {
        doTask3("ve nha", finish)
    })
})

doTask1("di lam ", finish)

//API ds user - thong tin theo id - ds bai viet - chi tiet bai viet - xem comment

//