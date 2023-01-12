function sum(x, y) {
    return x + y
}

console.log(sum(10, 20));


let sum1 = function (x, y) {
    return x + y
}
console.log(sum1(10, 20));


let sum2 = (x, y) => {
    return x + y
};
console.log(sum2(10, 20));


let sum3 = (x, y) => x + y;
console.log(sum3(20, 30));


let power = function (v) {
    return v * v
}
console.log(power(10));


let power1 = v => v * v
console.log(power1(10));


let upCase = str => str.toUpperCase()
console.log(upCase('hello'));


let hello = () => 'Hello world'
console.log(hello());

let print = () => {
    console.log('Hello world')
};
print();

let math = (a, b, c, d) => {
    let res = a + b
    let res1 = c - d
    return res / res1
}
console.log(math(1, 2, 3, 4))


// let getObject = name => {firstName: name }

let getObject = name => {
    return {firstName: name}
}
console.log(getObject('Tony'))

let getObject1 = name => ({firstName: name});
console.log(getObject1('Tony'));


let arr = [1, 2, 3, 4, 5];
console.log(arr.filter(function (v) {
    return v % 2 === 0
}));

console.log(arr.filter(v => v % 2 === 0));

// _____________________________________________
arr.forEach(v => console.log(v));

// _____________________________________________

function clickHandler() {
    console.log(this)
}

clickHandler();

const btn = document.querySelector('#simple');
const btnArrow = document.querySelector('#arrow');
btn.onclick = clickHandler;

let clickHandlerArrow = () => {
    console.log(this)
}

btnArrow.onclick = clickHandlerArrow;

let tony = {
    name: 'Tony',
    displayName: function () {
        console.log(this.name)
    }
}

tony = {
    name: 'Tony',
    displayName: () => {
        console.log(this.name)
    }
}

window.name = 'window'

tony.displayName()

let ksenia = {
    name: 'Ksenia',
}
ksenia.display = tony.displayName
ksenia.display()

function Timer(seconds) {
    this.counter = seconds,
        this.tick = function () {
            this.counter--
            console.log(this.counter)
        }
}

let timer = new Timer(100)
// console.log(timer.counter)
// timer.tick()
// timer.tick()
// timer.tick()
// console.log(timer.counter)

// setInterval(timer.tick, 1000) - error, lost context

// setInterval(function (){
//     timer.tick()
//     }, 1000)

// setInterval(timer.tick.bind(timer), 1000);

function TimerArrow(seconds) {
    this.counter = seconds,
        this.tick = () => {
            this.counter--
            console.log(this.counter)
        }
}

let timerArrow = new TimerArrow(100)
setInterval(timerArrow.tick, 1000)






