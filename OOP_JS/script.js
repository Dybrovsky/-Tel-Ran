function Point(x, y){
    this.x = x;
    this.y = y;
}
let point1 = new Point(10,10);
console.log(point1);

let point2 = Point(20,20);  //don't work without 'new'
console.log(point2);

// function Point2(x,y){
    // this = {};
    // this.x = x;
    // this.y = y;
    // return this;
// }


// _______________________________________________________

const human = {
    hobby: 'reading',
    fullName: function (){
        return `${this.firstName} ${this.lastName}`;
    }

}

// _______________________________________________________


const john = {
    firstName: 'John',
    lastName: 'Smith'
}
console.log(john.firstName);
console.log(john.lastName);

john.__proto__ = human;
console.log(john.hobby);

console.log(john.fullName());

const mariya = {
    firstName: 'Mariya',
    lastName: 'Smith'
}
mariya.__proto__ = human;
console.log(mariya.fullName());

function Person(firstName, lastName){
    this.firstName = firstName;
    this.lastName = lastName;
}
Person.prototype = human;
const peter = new Person('Peter', 'Jackson');
const marfa = new Person('Marfa', 'Doo');

console.log(peter.fullName());
console.log(marfa.fullName());
console.log(marfa);

Person.prototype.toString = function (){
    return `First name: ${this.firstName}, Last name: ${this.lastName}, Hobby: ${this.hobby}`;
}
console.log(marfa);
console.log(human.toString());

console.log(marfa.hasOwnProperty('hobby'));
console.log(marfa.hasOwnProperty('lastName'));

let obj = {
    name: 'My object'
}
let obj2 = Object.create(obj);
console.log(obj2);










