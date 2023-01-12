let count = 100;
let timer = setInterval(function (){
    console.log(count--);
}, 100 );

console.log('end of code');

// stack <- messageQueue <- WebAPI

setTimeout(function (){
    console.log('Timeout');
    clearInterval(timer)
    }, 500);
let user = 'Tony'
// window.user = 'Olga';
function greeting(){
    // let user = 'Mike'
    return function (){
        // let user = 'Vika'
        console.log(`Hello ${user}`)
    }
}
 const hello = greeting();
hello();