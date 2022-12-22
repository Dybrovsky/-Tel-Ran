// alert('Hello Amigo!');
console.log('Hello world');

let guestlist = `Guests:
* John
* Pete
* Mary`
console.log(guestlist);

let z = 'Hello';
let x = 'Java';
console.log(z + ' today I learn ' + x);
console.log(`${z} today I learn ${x}`);



sayHello('Tony');
function sayHello(name) {
    console.log('Hello', name);
    console.log('Hello ' + name + ' !')
    console.log(`Hello ${name}`);
}

let point = {
    x:10,
    y:20,
    toString: function (){
        return JSON.stringify(this);
    }

}

let point2 = {
    x:10,
    y:20,
    toString: function (){
        return JSON.stringify(this);
    }
}

console.log(point.x);
console.log(point[`x`]);

console.log('point' + point);
console.log('point2', point2);

function numIncrement(number) {
    number++;
    return number;

}
let number = 10;
number = numIncrement(number);
console.log(number);


function pointIncrement(point) {
    point.x++
    point.y++

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

console.log(Object.values(point));
console.log(Object.keys(point));
console.log(Object.entries(point));

let entries = Object.entries(point);
for (let entry of entries){
    console.log(entry);
}

for (let entry of entries){
    console.log(entry[0]);
}
for (let entry of entries){
    console.log(entry[0], '->', entry[1]);
}



let names = ['Hello', 123,true];
console.log(names);
console.log(names[1]);

console.log(names.length);

names[100] = '100';
console.log(names);
