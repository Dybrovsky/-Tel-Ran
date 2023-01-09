class Person{
    constructor(firstName, lastName, age) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._age = +age;
    }

    fullName = function (){
        return `${this.firstName} ${this.lastName}`;
    }

    // getAge(){
    //     return this._age;
    // }
    // setAge(age){
    //     this._age = +age;
    // }

    get age(){
        return this._age;
    }

    set age(age){
        this._age = +age;
    }

    get firstName(){
        return this._firstName;
    }

    set firstName(firstName){
        this._firstName = firstName;
    }

    get lastName(){
        return this._lastName
    }

    set lastName(lastName){
        this._lastName = lastName;
    }
}

const john = new Person('John', 'Smith', 28);
console.log(john);
console.log(john.fullName());

console.log(john._firstName);
john._lastName = 'Moris';
console.log(john._lastName);
console.log(john);

// console.log(john.getAge());
// john.setAge(100);
// console.log(john.getAge());

console.log(john.age);
john.age = 100;
console.log(john.age)

class Employee extends Person{
    constructor(firstName, lastName, age, salary) {
        super(firstName, lastName, age);
        this._salary = salary;
    }

    get salary() {
        return this._salary;
    }

    set salary(salary) {
        if (salary > this.salary)
        this._salary = +salary;
    }
}

const peter = new Employee('Peter', 'Jackson', 25, 10000);
console.log(peter);
console.log(peter.salary);
peter.salary = 17000;
console.log(peter.salary);

peter.salary = 15000;
console.log(peter.salary);


class Company{
    constructor() {
        this._employees = [];

    }
    get employees(){
        return [...this._employees];
    }

    addEmployee(employee){
        if(employee)
            this._employees.push(employee);
    }

    removeEmployee(index){
        this._employees.splice(index, 1);
    }

    get quantity(){
        return this._employees.length;
    }
}

const firm = new Company();
firm.addEmployee(peter);
firm.addEmployee(new Employee('Tigran', 'Petrosyan', 39, 21000));
console.log('==================================');
console.log(firm.quantity);
firm.addEmployee(null);
console.log(firm.quantity);

// firm.employees.forEach(item=>console.log(item)); //item -> employees[item]

firm.employees.forEach(function (item){
    console.log(item);
});





