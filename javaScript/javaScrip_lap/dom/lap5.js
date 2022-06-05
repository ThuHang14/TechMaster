// $('h1').text('defgh');
// $('.red').css({ background: ' red' });
$(function() {

        const $str = $('tr')

        for (let i = 0; i < $str.length; i++) {
            const tr = $str[i];

            const $td = $(tr).children().eq(i);
            $td.css({ color: 'red' })
            console.log($td);
        }
        // 810
        $(function() {
            $('tr').each( //callback
                function(index, tr) {
                    let $td = $(tr).children();
                    $td
                        .filter(`:nth-child(${index + 1}), :nth-child(${$td.length - index})`)
                        .css({ color: 'red' });
                });
        });
        // 850
    })
    // color random 
const directions = [
    'to right',
    'to left',
    'to bottom',
    'to top',
    'to right bottom',
    'to right top',
    'to left bottom',
    'to left top',
];

function getRandomDirection() {
    // trả về một hướng màu ngẫu nhiên
    return directions[Math.floor(Math.random() * directions.length)];
}

function getRandomHexColor() {
    // trả về một mã màu hex ngẫu nhiên
    let randomColor = Math.floor(Math.random() * 16777215).toString(16);

    return randomColor.padStart(6, '0');
}

$(function() {
    // truy vấn ra các thẻ cụ thể (body, các thẻ liên quan hướng, màu, nút)
    const $body = $('body');
    const $direction = $('.direction');
    const $from = $('.from');
    const $to = $('.to');
    const $btn = $('.btn-change');

    function changeColor() {
        const randomDirection = getRandomDirection();
        const from = getRandomHexColor();
        const to = getRandomHexColor();

        console.log(randomDirection, from, to);

        $body.css({
            backgroundImage: `linear-gradient(${randomDirection}, #${from}, #${to})`,
        });
        $direction.text(randomDirection);
        $from.text(from).css({ color: `#${from}` });
        $to.text(to).css({ color: `#${to}` });
    }

    changeColor();

    $btn.on('click', changeColor);
});