// 1. The default paragraph size is 20 px. 3 buttons change the font size of the paragraph,
//     and 3 buttons that change the font color.
//     All buttons must work independently of each other.
//     When we change the color, the size should remain the same as it was

const paragraph = document.querySelector('.first_task');

const small_text = document.querySelector('.size_10');
const medium_text = document.querySelector('.size_20');
const large_text = document.querySelector('.size_30');

const tomato = document.querySelector('.colour_tomato');
const green = document.querySelector('.colour_green');
const blue = document.querySelector('.colour_blue');


small_text.addEventListener('click', changeSize_10);
medium_text.addEventListener('click', changeSize_20);
large_text.addEventListener('click', changeSize_30);

function changeSize_10() {
    paragraph.style.fontSize = '10px';
}

function changeSize_20() {
    paragraph.style.fontSize = '20px';
}

function changeSize_30() {
    paragraph.style.fontSize = '30px';
}

function changeColour_tomato() {
    paragraph.style.color = 'tomato';
}

function changeColour_green() {
    paragraph.style.color = 'green';
}

function changeColour_blue() {
    paragraph.style.color = 'blue';
}

tomato.addEventListener('click', changeColour_tomato);
green.addEventListener('click', changeColour_green);
blue.addEventListener('click', changeColour_blue);


// 2. Calculator. Validation is also not interested. The pitfall is that the input always returns strings, and + for strings is a concatenation


const operand1add = document.querySelector('.operand1add');
const operand2add = document.querySelector('.operand2add');

const add = document.querySelector('#add');
const addValue = document.querySelector('#plus');

add.addEventListener('click', function () {
    addValue.innerHTML = +operand1add.value + +operand2add.value;
})


const operand1sub = document.querySelector('.operand1sub');
const operand2sub = document.querySelector('.operand2sub');

const sub = document.querySelector('#sub');
const subValue = document.querySelector('#minus');

sub.addEventListener('click', function () {
    subValue.innerHTML = +operand1sub.value - +operand2sub.value;
})

const operand1mult = document.querySelector('.operand1mult');
const operand2mult = document.querySelector('.operand2mult');

const multi = document.querySelector('#multi');
const multiValue = document.querySelector('#multiply');

multi.addEventListener('click', function () {
    multiValue.innerHTML = +operand1mult.value * +operand2mult.value;
})


const operand1div = document.querySelector('.operand1div');
const operand2div = document.querySelector('.operand2div');

const div = document.querySelector('#div');
const divValue = document.querySelector('#division');


div.addEventListener('click', function () {
    divValue.innerHTML = +operand1div.value / +operand2div.value;
})


// 3. The application checks if the word is a palindrome or not. Special conditions. Any number of spaces at the beginning and at the end are not counted, the case is also not counted. One symbol is also a palindrome


let palindromeString = document.querySelector('.palindrome');
let resultBtn = document.querySelector('#check');

const newH = document.createElement('h1');
let palindrome = document.createTextNode('This is a palindrome');
let isntPalindrome = document.createTextNode('This isnt a palindrome');
const palindrome_task = document.querySelector('.palindrome_task');
palindrome_task.appendChild(newH);


resultBtn.addEventListener('click', function () {

    if (palindromeString.value === palindromeString.value.split('').reverse().join('')) {
        if(!newH.firstChild)
            newH.appendChild(palindrome);
        else
            newH.replaceChild(palindrome, newH.firstChild);
        
        //palindrome_task.replaceChild(newH, palindrome_task.lastChild)
            newH.style.color = 'green';
        // palindrome_task.replaceChild(palindrome, palindrome_task.lastChild)
        // palindrome_task.append(palindrome)

    } else {
        // newH.appendChild(isntPalindrome)
        // palindrome_task.replaceChild(newH, palindrome_task.lastChild)
        if(!newH.firstChild)
        newH.appendChild(isntPalindrome);
    else
        newH.replaceChild(isntPalindrome, newH.firstChild);
        newH.style.color = 'red';

        // palindrome_task.replaceChild(isntPalindrome, palindrome_task.lastChild)
        // palindrome_task.append(isntPalindrome)}

    }
})


    





