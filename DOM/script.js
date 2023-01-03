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
    pDiv[i].innerHTML = `<span>new text ${i+1}</span>`;
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

function move(){
    pos++
    if (pos >= 151){
        clearInterval(interval)
        return
    }
    box.style.left = pos + 'px';
    box.style.top = pos + 'px';
}








