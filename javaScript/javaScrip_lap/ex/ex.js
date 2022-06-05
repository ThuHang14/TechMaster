const products = [{
        name: 'Samsung S22 Ultra',
        category: 'Điện thoại',
        price: 30000000,
        quantity: 100,
    },
    {
        name: 'Dell XPS',
        category: 'Laptop',
        price: 40000000,
        quantity: 29,
    },
    {
        name: 'Iphone 13 Promax',
        category: 'Điện thoại',
        price: 34000000,
        quantity: 50,
    },
    {
        name: 'Tủ lạnh Toshiba',
        category: 'Gia dụng',
        price: 8000000,
        quantity: 50,
    },
    {
        name: 'Tủ lạnh Samsung',
        category: 'Gia dụng',
        price: 12000000,
        quantity: 40,
    },
    {
        name: 'Tủ lạnh Nikkei',
        category: 'Gia dụng',
        price: 9000000,
        quantity: 0,
    },
    {
        name: 'Oppo Reno 7',
        category: 'Điện thoại',
        price: 13000000,
        quantity: 29,
    },
    {
        name: 'Xiaomi redmi note 5',
        category: 'Điện thoại',
        price: 3900000,
        quantity: 29,
    },
    {
        name: 'ASUS Zenbook',
        category: 'Laptop',
        price: 21590000,
        quantity: 50,
    },
    {
        name: 'Macbook',
        category: 'Laptop',
        price: 25500000,
        quantity: 12,
    },
    {
        name: 'SamSung note 9',
        category: 'Điện thoại',
        price: 3333,
        quantity: 2,
    },
    {
        name: 'iPad 10.2 2021',
        category: 'iPad',
        price: 16500000,
        quantity: 10,
    },
    {
        name: 'Bphone X',
        category: 'Điện thoại',
        price: 10000000,
        quantity: 0,
    },
    {
        name: 'Bánh quy',
        category: 'Thực phẩm',
        price: 25000,
        quantily: 0,
    },
    {
        name: 'Lenovo L340',
        category: 'Máy tính',
        price: 15900000,
        quantity: 25,
    },
];

function createProduct(product) {
    const $template = $(
        document.querySelector('.product-template').content.firstElementChild
    ).clone();

    $template.find('.product-name').text(product.name);
    $template.find('.product-category').text(product.category);
    $template.find('.product-price').text(product.price);
    $template.find('.product-quantity').text(product.quantity);

    $template.data(product); // $tr.data()

    return $template;
}

function createList() {
    const $list = products.map(function(product) {
        return createProduct(product);
    });
    return $list;
}

function render() {
    const $list = $('tbody');
    const $products = createList();

    $list.append($products);
}

function showAvailable(e) {
    const isCheck = e.target.checked;
    const $products = $('.product-row');

    $.each($products, function(index, product) {
        const data = $(product).data();

        if (data.quantity == 0) {
            if (isCheck) $(product).addClass('hidden');
            else $(product).removeClass('hidden');
        }
    });
}

function sortBy(option) {
    const products = $('.product-row').get();

    products.sort(function(productA, productB) {
        const dataOfProductA = $(productA).data();
        const dataOfProductB = $(productB).data();

        if (option.isAscending) {
            return dataOfProductA[option.key] - dataOfProductB[option.key];
        } else {
            return dataOfProductB[option.key] - dataOfProductA[option.key];
        }
    });

    $('tbody').append(products);
}

function sortProduct(e) {
    const option = +e.target.value;

    switch (option) {
        case 1:
            sortBy({ key: 'price', isAscending: true });
            break;

        case 2:
            sortBy({ key: 'price', isAscending: false });
            break;

        case 3:
            sortBy({ key: 'quantity', isAscending: true });
            break;

        case 4:
            sortBy({ key: 'quantity', isAscending: false });
            break;

        default:
            break;
    }
}
// 

function findCategory() {
    const $find = products.map(function(product) {
        return product.category
    })
    console.log($find);

    const find = $find.filter((item, index) => {
        return $find.indexOf(item) === index
    })
    for (i = 0; i < find.length; i++) {
        $('#category').append('<option class="option-category" value="' + find[i] + '" > ' + find[i] + '</option>')
    }
    console.log(find);

}


function chooseCategory(e) { //
    const isCheck = e.target.value;
    const $products = $('.product-row');

    $.each($products, function(index, product) {
        const data = $(product).data();

        if (data.category == isCheck) {
            $(product).removeClass('hidden');
        } else if (isCheck == 'exit') {
            $(product).removeClass('hidden');
        } else {
            $(product).addClass('hidden');
        }
    });

}

$(function() {
    $('#status').on('change', showAvailable);
    $('#sort').on('change', sortProduct);
    $('.filter-category').on('change', chooseCategory)
    render();
    findCategory()
});