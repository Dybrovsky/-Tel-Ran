//alert('Hello from js file');
console.log('Hello world');
let guestList = `Guests:
* John
* Pete
* Mary`;
console.log(guestList);

let z = 'Hello';
let x = 'Java';
console.log(z + ' today I learn ' + x);
console.log(`${z} today I learn ${x}`);
//======================================
var x1 = 10;
console.log(x1);
let y = 10;
console.log(y);
const z1 = 10;
console.log(z1);
let f = null;
console.log(f);
//======================================
console.log('3' + 3);
console.log('2' - 2);
let num = 5;
console.log(num + '');
let bool = true;
console.log(bool + '');
console.log(bool + 1);
console.log(bool + 1 + '1');
y = '123';
console.log(y);
console.log(+y);
console.log(!'a');
console.log(!'');
console.log(!!'');
console.log(!2);
console.log(!0);
console.log(null == 0);
console.log(Number(null) == 0)
console.log(Number(undefined));
console.log(Number(undefined) == NaN);
console.log(NaN == NaN);
console.log(isNaN(Number(undefined)));
console.log(isNaN(Number('3214')));
num = 1234;
console.log(typeof num);
let numS = String(num);
console.log(typeof numS);
console.log(typeof String(num));
console.log(typeof String(true));
console.log(typeof Number('123'));
console.log(typeof (typeof undefined));
//==============================================

console.log(sayHello('everybody'));

function sayHello(name) {
    console.log('Hello', name, '!');
    //console.log('Hello ' + name + '!');
    //console.log(`Hello ${name}!`);
}

let point =
    {
        x: 10,
        y: 20,
        toString: function () {
            return JSON.stringify(this);
        }
    }
let point2 =
    {
        x: 10,
        y: 20,
        toString: function () {
            return JSON.stringify(this);
        }
    }
console.log(point.x);
console.log(point[`x`]);
console.log(point.z);

console.log('point' + point);
console.log('point2' + point2);

function numIncrement(number) {
    number++;
    return number;
}

let number = 10;
number = numIncrement(number);
console.log(number);

function pointIncrement(point) {
    point.x++;
    point.y++;
}

console.log(point2);
pointIncrement(point2);
console.log(point2);

console.log(point);
point.x = 30;
point.z = 80;
console.log(point);
delete point.x;
console.log(point);
console.log(point.x);

console.log(Object.values(point));
console.log(Object.keys(point));
console.log(Object.entries(point));

let entries = Object.entries(point);
for (let entry of entries) {
    console.log(entry);
}

for (let entry of entries) {
    console.log(entry[0]);
}
for (let entry of entries) {
    console.log(entry[0],'->', entry[1]);
}
//=============================================
let names = ['Hello', 123, true];
console.log(names);
console.log(names[0]);
console.log(names.length);
names[100] = 'Bye';
console.log(names);
console.log(names.length);
console.log(names[50]);
console.log(names[150]);
