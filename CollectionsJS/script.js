let name = prompt('Name');
let secondName = prompt('second Name');
let age = prompt('age');



function Person(name, secondName, age) {
    this.name = name;
    this.secondName = secondName;
    this.age = age;
}

let person = new Person(name = prompt('Name'),secondName = prompt('second Name'), age = prompt('age'));


