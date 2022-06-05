let h2Element = document.querySelector('h2');

h2Element.onclick = function() {
    console.log(Math.random());
}

let h3Element = document.querySelectorAll('h3');
for (i = 0; i < h3Element.length; ++i) {
    h3Element[i].onclick = function(e) {
        console.log(e.target);
    }
}