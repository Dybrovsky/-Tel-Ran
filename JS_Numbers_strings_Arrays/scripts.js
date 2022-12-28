let x = 255;
console.log(x.toString());
console.log(x.toString(2));
console.log(x.toString(8));
console.log(x.toString(10));
console.log(x.toString(16));

console.log('===================');

x = 1.656;
console.log(x.toExponential());
console.log(x.toExponential(2));

console.log('===================');

console.log(x.toFixed());
console.log(x.toFixed(3));

console.log('===================');

console.log(x.toPrecision());
console.log(x.toPrecision(6));

console.log('===================');

console.log(Number(false));
console.log(Number('   12.34   '));
console.log(Number('312334a23'));
console.log(Number('3131,123'));

console.log('===================');
console.log(parseInt('123'));
console.log(+'123');
console.log(parseInt('123.99'));
console.log(parseInt('123 45 66 789'));
console.log(parseInt(false));

console.log(parseFloat('123'));
console.log(parseFloat('123.45'));
console.log(parseFloat('123,45'));

console.log('===================');

console.log(Number.MAX_VALUE);
console.log(Number.MIN_VALUE);
console.log(Number.POSITIVE_INFINITY);
console.log(Number.NEGATIVE_INFINITY);
console.log(Number.NaN);
console.log('===================');

x = Number.NaN;
console.log(isNaN(x));
console.log(isFinite(x));
x = Number.NEGATIVE_INFINITY;
console.log(isFinite(x));
console.log('===================');

x = 10.4;
console.log(Math.round(x));
console.log(Math.PI);

let resMax = Math.max(1,2,4,5,6,7,33);
console.log(resMax);

let resMin = Math.min(1,2,4,5,6,7,33);
console.log(resMin);

console.log(Math.random());
let min = 10;
let max = 100;

console.log(Math.round(Math.random()*(max-min+1) + min));

console.log(Math.trunc(Math.random()*(max-min+1) + min));

console.log('=========STRINGS==========');

let str = 'Hello world'
console.log(str.length);

console.log(str.toUpperCase());
console.log(str.toLowerCase());
for (let i = 0; i < str.length; i++) {
    console.log(str.charAt(i));
}
console.log(str.indexOf('l'));
console.log(str.indexOf('l', 4));
console.log(str.lastIndexOf('l', 4));
console.log(str.includes('ll', 3));

console.log(str.startsWith('Hello'));
console.log(str.startsWith('llo'));
console.log(str.endsWith('ld'));

console.log(str.substring(1,5));
console.log(str.substr(1, 5));

console.log(str.slice(1, 7));
console.log(str.slice(1, -5));

str = '     Hello     ';
console.log(str.length); // 15
str = str.trim();
console.log(str.length); //5

str = 'Hello MASA! Go!';
console.log(str.split(' '));

console.log(str.repeat(5));

console.log('=========ARRAYS==========');

let array = [];
console.log(array.length);
array[100_000] = 20;
console.log(array.length);
console.log(array);
console.log(array[0]);

array = [1,2,3,4];
console.log(array);

array = new Array(10);
console.log(array);

array = [1,2,3,4,5,6,7,8,9,12];
console.log(array.length);
array.length = 5;
console.log(array.length);
console.log(array);
console.log(array[5]); //undefined

array.push(32, 44);
console.log(array);
array.length = 10;
console.log(array);

console.log(array.pop());
console.log(array);

console.log(array.unshift(11, 12)); //add first
console.log(array);

let arrTest = [77,777];
array.unshift(arrTest);
console.log(array);
array.shift(); // delete first
array.unshift(...arrTest);
console.log(array);

let array2 = array;  //link
console.log(array2);
array2[0] = 100500;
console.log(array);

array.splice(2, 0, 50, 60);
console.log('!!!!!!!!!!!!');
console.log(array);

array.splice(2, 1);
console.log(array);

array.splice(2, 1, ...arrTest);
console.log(array);

let arrayConcat = array.concat(...arrTest);
console.log(arrayConcat);

array.reverse();
console.log(array);

let strTest = array.join(' -> ');
console.log(strTest);

console.log(array.indexOf(32));
console.log(array.indexOf(32, 5)); //second choose position
console.log(array.lastIndexOf(77));
console.log(array.lastIndexOf(77, 3));


let res2 = array.find(function (item, index){
    return item === 77 && index > 10;
    // return item % 2 && index > 7;
});
console.log(res2);

let evenArray = array.filter(function (it){
    return it % 2 === 0;
});

console.log(evenArray);

array.sort(); //abc
console.log(array);

let ar = ['fff', 'ssss', 'aaaa', 'bbbb'];
ar.sort(function (a,b){
   if(a>b)
       return -1;
   if(a<b)
       return 1;
   return 0;
});


console.log(ar);

array.sort(function (a, b){
    return a - b;
});
console.log(array);

ar.forEach(function (item){
    console.log(item + '!');
});

let resAr = array.map(function (item){
    return item * 2;
})
console.log(array);
console.log(resAr);