let person = []
    // load()


function createPerson(person) {
    const $template = $(document.querySelector('.template').content.firstElementChild).clone()
    $template.find('.o').text(person.id)
    $template.find('.fullname').text(person.name)
    $template.find('.gender').text(person.address.city)
    $template.find('.age').text(person.address.zipcode)
    $template.find('.email').text(person.email)
    $template.find('.phone').text(person.phone)
    $template.find('.btn-delete').on('click', function() {
        // deleteTask(person.id);
    });
    // save()
    return $template
}

function createList() {
    const $list = person.map(function(text) {
        return createPerson(text)
    })

    return $list
}

function render() {
    $('tbody').append(...createList())
}

// function load() {
//     const data = localStorage.getItem('person')

//     if (data) {
//         return JSON.parse(data)
//     } else {
//         return []
//     }
// }

// function save() {
//     localStorage.setItem('person', JSON.stringify(person))
// }

function btnAdd() {

    const $hidden = $('.tr-hidden')
    if ($hidden.hasClass('hidden')) {
        $hidden.removeClass('hidden')
        $('.btn-add').text('Exit')
        $('.btn-add2').removeClass('hidden')
        $('.btn-add2').on('click', addPerson)
    } else {
        $hidden.addClass('hidden')
        $('.btn-add').text('Add Person')
        $('.btn-add2').addClass('hidden')

    }
}

function createPerson2(name, gender, age, email, phone) {
    person.push({
            o: person.length + 1,
            fullname: name,
            gender: gender,
            age: age,
            email: email,
            phone: phone
        })
        // save()
    return person[person.length - 1]
}

function addPerson(e) {
    e.preventDefault()
    const $id = $('.o')
    const $fullname = $('.fullname2')
    const $gender = $('.gender2')
    const $age = $('.age2')
    const $email = $('.email2')
    const $phone = $('.phone2')

    const id = $id.val()
    const fullname = $fullname.val()
    const gender = $gender.val()
    const age = $age.val()
    const email = $email.val()
    const phone = $phone.val()


    $fullname.val('')
    $gender.val('')
    $age.val('')
    $email.val('')
    $phone.val('')
}

function deletePerson() {

}

function chooseGender() {

}
$(function() {
    // render()
    $('.btn-add').on('click', btnAdd)

    $.ajax('https://jsonplaceholder.typicode.com/users', {
        success(response) {
            person = person.concat(response)
            render()
        },
        error(error) {
            console.log('fail');
            console.log(error);
        }
    })
})