function whoIsMore(a, b) {
    return a > b ? `a = ${a}` : (a < b ? `b = ${b}` : 'a == b');
}

console.log(whoIsMore(10, 20));
console.log(whoIsMore(20, 10));
console.log(whoIsMore(20, 20));

function sum(a, b) {
    console.log(a + b);
}

// let add = sum(12, 33);
let add = sum;
console.log(add(10, 20));

let div = function (a, b) {
    console.log(a / b);
}

div(20, 10);

function choice(f1, f2, a, n) {
    if (n || n == 0)
        return f1(a, n);
    else
        return f2(a);
}

function f1(a, n) {
    return a + n;
}

function f2(a) {
    return a * 2;
}

console.log(choice(f1, f2, 10, 0));
console.log(choice(f1, f2, 10));
console.log(choice(f1, f2, 10, 1, 13, 66));
(function (name) {
    console.log('Hello ' + name);
})('Java Script')

function some(num) {
    //====v1=====
    // if(!num)
    //     num = 100;
    //====v2=====
    let res = num || 100;
    console.log(res);
}

some();

//========var3=========
function some2(num = 100) {
    console.log(num);
}

some2();
//===============||&&============
let result = 0 || null || 3 || 'hello';
result = undefined || null || 0 || '';
console.log(result);

//----------------
result = 11 && 'hello' && 'mn';
console.log(result);
//==================

console.log(5 ** 2);

//=================
function Point(x, y) {
    this.x = x;
    this.y = y;
}

let point1 = new Point(10, 20);
let point2 = new Point(10, 20);

console.log(point1.x == point2.x);
console.log(point1.x == point2.x && point1.y == point2.y);
console.log(point1 == point2);
console.log(point1 === point2);
console.log(3 == '3');
console.log(3 === '3');
console.log(JSON.stringify(point1) === JSON.stringify(point2));

let mark = '5';
switch (mark) {
    case 1:
        console.log(1);
        break;
    case 2:
        console.log(2);
        break;
    case 3:
        console.log(3);
        break;
    case 4:
        console.log(4);
        break;
    case 5:
        console.log(5);
        break;
}

let i = 10;
while (i) {
    console.log(i);
    i--;
}

for (let key in point1) {
    console.log(key);
}

let ar = [1, 2, 3, 4, 5, 6, 7, 8];
for (let key in ar) {
    console.log(key);
}
for (let key in ar) {
    console.log(ar[key]);
}

// for (let value of point1){
//     console.log(value);
// }

for (let value of ar) {
    console.log(value);
}

let str = 'Hello';
for (let value of str) {
    console.log(value);
}
//====================
let date = new Date();
console.log(date);
console.log(`${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`);

// let res = confirm("Is your age more then 18?");
// alert(res);
// let name = prompt("Enter your name")
//alert(name);
//===================
const set = new Set();
set.add(5);
set.add('Five');
set.add('5');
set.add('Five');
console.log(set);
for (let x of set) {
    console.log(x);
}
console.log(set.size);
console.log(set.has('6'));
console.log(set.delete('5'));
console.log(set.has('5'));
//set.clear();
console.log(set.size);
let arr = Array.from(set);
console.log(arr);
arr = Array.from('Masa2022');
console.log(arr);
//--------------
const map = new Map();
map.set(1,'Peter');
map.set('two','Tigran');
map.set(3,`Peter2`);
console.log(map);
console.log(map.size);
console.log(map.get('two'));
for(let x of map){
    console.log(x);
}
for(let x of map){
    console.log(`${x[0]} -> ${x[1]}`);
}

console.log(map.has('two2'));
let res = map.values();
for (let x of res){
    console.log(x);
}

res = map.keys();
for (let x of res){
    console.log(x);
}

res = map.entries();
for (let x of res){
    console.log(x);
}