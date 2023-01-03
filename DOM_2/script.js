console.log(this); //window

// const div1 = document.getElementById('div1');
// const p1 = document.getElementsByClassName('p1');
// const p = document.getElementsByTagName('p');

const div1 = document.querySelector('#div1');
const p1 = document.querySelector('.p1');
const p = document.querySelector('p');
const pAll = document.querySelectorAll('p');
const pDiv = document.querySelectorAll('div > p');
const pOuter = document.querySelector('#outer');

console.log(div1);
console.log(p1);
console.log(p);
console.log(pAll);
console.log(pDiv);

div1.style.border = '1px solid blue';
for (let i = 0; i < pDiv.length; i++) {
    pDiv[i].innerHTML = `<span>new text ${i + 1}</span>`;
}
console.log(div1.innerHTML);

console.log(pOuter.className)
pOuter.className = 'header';
// pOuter.className = pOuter.className +' active'
pOuter.className += ' active';

// if(pOuter.className.endsWith('active'))
//     pOuter.className = 'header';
// else
//     pOuter.className = 'header active'

console.log(pOuter.classList);

pOuter.classList.toggle('active');


const box = document.querySelector('#box');

let pos = 0;

let interval = setInterval(move, 30);

function move() {
    pos++
    if (pos >= 151) {
        clearInterval(interval)
        return
    }
    box.style.left = pos + 'px';
    box.style.top = pos + 'px';
}


// ===========================dom===============================

const childs = div1.children;
for (let i = 0; i < childs.length; i++) {
    childs[i].style.color = 'red';
}

// ==========create, delete, update============
const newP = document.createElement('p');
const newPText = document.createTextNode('This text is created with special method');
newP.className = 'active';

newP.appendChild(newPText);
div1.appendChild(newP);

// node.append()
// node.prepend()
// node.before()
// node.after()
// node.replaceWith()

div1.before('Before');
div1.after('After');
div1.before(newP);

const newP2 = document.createElement('p');
const newP2Text = document.createTextNode('This is new p2 text');
newP2.append(newP2Text);
div1.replaceChild(newP2, div1.firstElementChild);
div1.removeChild(div1.firstElementChild.nextElementSibling)

// ================clock======================

let clock = document.querySelector('#clock');
setInterval(printTime, 1000);


function printTime() {
    const d = new Date();
    const h = d.getHours();
    const m = d.getMinutes();
    const s = d.getSeconds();

    const time = document.createTextNode(`${h < 10 ? '0' + h : h} : ${m < 10 ? '0' + m : m} : ${s < 10 ? '0' + s : s}`);
    const h1 = document.createElement('h1');
    h1.append(time);

    if (clock.firstElementChild) {
        clock.replaceChild(h1, clock.firstElementChild);
    } else {
        clock.append(h1);
    }
}










