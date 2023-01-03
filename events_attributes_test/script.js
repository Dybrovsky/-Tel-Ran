let myInput = document.querySelector('.myInput');
let btn = document.querySelector('.btn');

function show(){
    console.log('click!')
}

// btn.onclick = show;

 
// btn.onclick = function (){
//     const text = myInput.value;
//     console.log(text);
// }

// btn.onclick = function (){
//     const text = myInput.value;
//     myInput.value = text.toUpperCase();
// }

myInput.onclick = changeText;

function changeText(event) {
    // console.log(event.target.value);
    const text = event.target.value;
    event.target.value = text.toUpperCase();
}
 
let google = document.querySelector('a');
google.onclick = function (e){
    e.preventDefault();
    alert('No, not today!');
}

btn.addEventListener('click', show);
btn.addEventListener('click', function (){
    alert('click');
})

let myInput2 = document.querySelector('#myInput2');

// myInput2.onkeyup = function (e){
//     // console.log(e);
//     if (e.keyCode === 13)
//         console.log(e)
// }

myInput2.onkeyup = function (e){
    // console.log(e);
    if (e.key === 'Enter')
        console.log(e)
    
}
let wrap= document.querySelector('.wrapper');
// wrap.onclick = function (){
//     console.log('clicked by wrapper!')
// }

wrap.onclick = function (e){
    console.log(e.target);
    console.log(e.currentTarget);
}

// ===============attributes===================

const myInput3 = document.querySelector('.myInput3');

console.log(myInput3.attributes);
console.log(myInput3.hasAttribute('id'));
console.log(myInput3.hasAttribute('class'));

myInput3.getAttribute('type');
myInput3.setAttribute('value', 'myInput3');
myInput3.setAttribute('id', 'my');
myInput3.removeAttribute('id');

const wrap2 = document.querySelector('.wrapper2');
wrap2.onclick = function (e){
    console.log(e.target.dataset);
    console.log(e.target.dataset.width)
}















