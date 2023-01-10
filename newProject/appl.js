const productLink = document.querySelector('#productLink');
const addLink = document.querySelector('#addLink');
const content = document.querySelector('.content');
const form = document.querySelector('form');
const section = document.querySelector('#section');
const sideNav = document.querySelector('.side-nav');
const input = document.querySelector('form div');
//const input = form.querySelector('div');
const input = form.querySelector('div');
const search = document.querySelector('nav ul li input');
const li = document.querySelectorAll('.side-nav ul li')

const store = new Store();

let milk = new Milk(1,'milk', 'tnuva', 10, 10);
let choco = new Chocolate(2, 'choco', 'milka', 50, 'black');
let wine = new Wine(3,'wine', 'latrun', 100, 12);
store.add(milk);
store.add(choco);
store.add(wine);


form.style.display = 'none';
renderProducts(store.getByType());

productLink.onclick = function () {
    form.style.display = 'none';
    sideNav.style.display = 'block';
    content.style.display = 'flex';
    productLink.classList.add('active');
    addLink.classList.remove('active');
    section.classList.remove('center');
    renderProducts(store.getByType(null));
};

addLink.onclick = function () {
    form.style.display = 'flex';
    sideNav.style.display = 'none';
    content.style.display = 'none';
    productLink.classList.remove('active');
    addLink.classList.add('active');
    section.classList.add('center');
};

function renderProducts(array) {
    content.innerHTML = `${array.map(function (p) {
        return `<div class="card">
                    <h2>${p.constructor.name}</h2>
                    <h3>${p.title}</h3>
                    <h3>${p.manufacture}</h3>
                    ${getOwnField(p).map(function (pair) {
            return `<h4>${pair.key} : ${pair.value}</h4>`
        })}
                    <h4>Price: ${p.price}</h4>
                </div>`
    }).join('')}`;
}

function getOwnField(product) {
    let res = [];
    for (let key in product) {
        if (key !== 'id' && key !== 'title' && key !== 'manufacture' && key !== 'price') {
            res.push({key: key, value: product[key]});
        }
    }
    return res;
}

form.type.onchange = function (e) {
    switch (e.target.value) {
        case 'milk':
            input.innerHTML = `<div>
                <input type="number" class="form-control" name="fat" placeholder="Type fat">
            </div>`;
            break;
        case 'chocolate':
            input.innerHTML = `<div>
                <input type="text" class="form-control" name="kind" placeholder="Type kind">
            </div>`
            break;
        case'wine':
            input.innerHTML = `<div>
                <input type="number" class="form-control" name="alcohol" placeholder="Type alcohol">
            </div>`;
            break;
    }
};


form.onsubmit = function (e) {
    e.preventDefault();//cancel default properties
    switch (e.target.type.value) {
        case 'milk':
            store.add(new Milk(e.target.id.value, e.target.title.value, e.target.manufacture.value,
                e.target.price.value, e.target.fat.value));
            break;
        case 'chocolate':
            store.add(new Chocolate(e.target.id.value, e.target.title.value, e.target.manufacture.value,
                e.target.price.value, e.target.kind.value));
            break;
        case 'wine':
            store.add(new Wine(e.target.id.value, e.target.title.value, e.target.manufacture.value,
                e.target.price.value, e.target.alcohol.value));
            break;
    }
};

sideNav.onclick = function (e){
    li.forEach(function (li){
        li.classList.remove('active')
    })
    e.target.classList.add('active')
    renderProducts(store.getByType(e.target.getAttribute('data-name')))
}

search.onchange = function (e){
    renderProducts(store.getByType(e.target.value))
}