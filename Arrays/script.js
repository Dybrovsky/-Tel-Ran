let array = [1,2,3,4,5];

let sum = array.reduce(function (accum,item){
    return accum + item;
})
console.log(sum)

sum = array.reduce(function (accum,item){
    return accum + item;
},0)
console.log(sum)

let min = array.reduce(function (accum,item){
    return accum>item ? item : accum;
})

let max = array.reduce(function (accum,item){
    return accum > item ? accum :item
})
console.log(max);


array = [[1,2,3], [4,5,6], [7,8]]; //[1,2,3,4,5,6,7,8]

console.log(array.reduce(function (accum, item){
    return accum.concat(item);
}));

console.log(array.reduceRight(function (accum, item){
    return accum.concat(item);
}))

array = ['Hello', ' ', 'world'];
console.log(array.map(function (str){
    return str.split('');
}))

console.log(array.flatMap(function (str){
    return str.split('');
}))


array = [1,2,3,4,5,6];

let a = array[0];
let b = array[1];
console.log(a);
console.log(b);

let[c,d,...e] = array
console.log('c ' + c);
console.log('d ' + d);
console.log('e ' + e);

let person =
    {
        firstName: 'Tony',
        lastName: 'Sever',
        age: 21,
        fullName: function ()
        {
            return `${this.firstName} ${this.lastName}`
        }
    }
    let {firstName, lastName, ...obj} = person;
console.log(firstName);
console.log(lastName);
console.log(obj);