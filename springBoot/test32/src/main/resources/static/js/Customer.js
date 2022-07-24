function filterTopic(name){
    window.location.href= window.location.pathname + "?topic=" + name;
}

const params = new URLSearchParams(window.location.search)
const topic = params.get("topic");

if(topic){
    let topicEl = document.getElementById(topic);
    if(topicEl) {
        topicEl.checked = true;

    }
}

function filterName(){
    let search = document.getElementById('searchName').value;
    document.getElementById('searchName').value = "";
    if(search !== ""){
        window.location.href= window.location.pathname + "?name=" + search;
    }
}

