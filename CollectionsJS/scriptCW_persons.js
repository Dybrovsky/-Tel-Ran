let persons = [];
const quantity = 5;

function Person(firstName, lastName, age) {
    this.firstName = firstName || 'no name';
    this.lastName = lastName || 'no Lastname';
    // age = Number(age);
    this.age = +age || 120;
}

for (let i = 0; i < quantity; i++) {
    let firstName = prompt('First name');
    let lastName = prompt('Last name');
    let age = prompt('Enter age');
    persons[i] = new Person(firstName, lastName, age);
}

function printMinMaxAvg(persons) {
    let age;
    let sum = Number(persons[0].age);
    let min = Number(persons[0].age);
    let max = Number(persons[0].age);
    let youngName = persons[0].firstName;
    let oldName = persons[0].firstName;
    for (let i = 1; i < persons.length; i++) {
        age = Number(persons[i].age);
        sum += age;

        if (age < min) {
            min = age;
            youngName = persons[i].firstName;
        }
        if (age > max) {
            max = age;
            oldName = persons[i].firstName;
        }
    }
    console.log(`Min age: ${min}`);
    console.log(`Max age: ${max}`);
    console.log(`Average age: ${sum / quantity}`);
    console.log(`Young man: ${youngName}`)
    console.log(`Old man: ${oldName}`)


}