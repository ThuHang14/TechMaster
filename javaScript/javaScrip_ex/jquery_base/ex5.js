$(function() {

    // BMI
    const $h = $('.input-height')
    const $w = $('.input-weight')
    const $btn = $('.btn')
    const $sp1 = $('.sp-1')
    const $sp2 = $('.sp-2')

    function chageText() {
        const h = $h.val()
        if (h >= 3 || h <= 0) {
            alert('height ?????')
            return h = 0
        }
        const w = $w.val()
        if (w >= 300 || w <= 0) {
            alert('weight ?????')
            return w = 0
        }
        const bmi = (w / (h ** 2).toFixed());
        let textBMI = ""
        if (bmi == 0) { textBMI = "0" } else if (bmi <= 16) { textBMI = ("sserver thinness"); } else if (bmi > 16 && bmi <= 17) { textBMI = ("moderate thinness"); } else if (bmi > 17 && bmi <= 18.5) { textBMI = ("mild thinness"); } else if (bmi > 18.5 && bmi <= 25) { textBMI = ("normal"); } else if (bmi > 25 && bmi <= 30) { textBMI = ("over weight"); } else if (bmi > 30 && bmi <= 35) { textBMI = ("obese class 1"); } else if (bmi > 35 && bmi <= 40) { textBMI = ("obese class 2"); } else if (bmi >= 45) { textBMI = ("obese class 3"); }
        console.log(bmi);
        console.log(textBMI);

        $sp1.text(bmi);
        $sp2.text("You fucking " + textBMI + "  !!!").css({
            color: ' #8383b6',
            fontSize: ' 25px'
        });
    }

    $btn.on('click', chageText)

    // tip caculator 

    const $tip = $('.tip')
    const $amount = $('.amount')
    const $guests = $('.guests')
    const $btnTip = $('.btn-tip')
    const $selectTip = $('.select-tip')

    function caclTip() {
        console.log($selectTip.val());
        if ($amount.val() == 0) {
            alert('amount ??')
            return 0
        }
        if ($guests.val() == 0) {
            alert('guests')
            return 0
        }
        const tip = ((($amount.val() * $selectTip.val()) / 100) / $guests.val()).toFixed(2)

        $tip.text("$" + tip)
    }
    $btnTip.on('click', caclTip)

})


//