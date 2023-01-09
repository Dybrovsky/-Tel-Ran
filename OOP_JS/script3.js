class Person {
    lastName;  // = 'Smith';
    name;
    static AGE = 42;
    #hiddenField;

    constructor(name, lastName, hiddenField) {
        this.name = name;
        this.lastName = lastName;
        this.#hiddenField = hiddenField;
    }

    get hiddenField() {
        return this.#hiddenField;
    }

    set hiddenField(hiddenField) {
        this.#hiddenField = hiddenField;
    }

    displayName() {
        console.log(this.name + ' ' + this.lastName);
        console.log(this.#hiddenField);
    }

    static doSome() {
        console.log('Do some method');
        console.log(this);
    }
}

let p = new Person('John', 'Smith');
console.log(p.name);
p.displayName(); //#2
console.log(p.lastName);
console.log(Person.AGE);
console.log(p);
Person.doSome();
p.displayName();
// console.log(p.#hiddenField);
// console.log(p.hiddenField);
console.log(p);

let p2 = new Person('Ivan', 'Shalnov');
console.log(p2);
let p3 = new Person('Ivan', 'Kovalenko', 'something');
console.log(p3);
p.hiddenField = 'some';
console.log(p.hiddenField);
console.log(p);
//===========================================
console.log(Object.getOwnPropertyDescriptor(p3, 'name'));
Object.defineProperty(p3, 'age', {
    configurable: true,
    value:30});
console.log(p3);
Object.getOwnPropertyDescriptor(p3, 'age');
p3.age = 33;
Object.defineProperty(p3, 'age',{
    configurable: true,
    value: 100,
    writable: true
});
Object.defineProperties(p3, {
    'age':{
        configurable: true,
        value: p3.age + 1,
        writable: true
    },
    'sex':{
        configurable: true,
        value: 'male'
    }
});
console.log(p3);
Object.preventExtensions(p3);
p3.phone = '768567474487';
console.log(p3);
console.log(Object.isExtensible(p3));

Object.seal(p3);
p3.name = 'Vasya';
