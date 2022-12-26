


function Person(name, secondName, age) {
    this.name = name || 'no name';
    this.secondName = secondName || 'no second name';
    this.age = age || 0;
}

let personArr = new Map();

for (let i = 0; i < 5; i++) {
    let name = prompt('Name');
    let secondName = prompt('second Name');
    let age = prompt('age');
    let personID = new Person(name, secondName, age);
    personArr.set(i, personID);
}



console.log(personArr);


    let minAgeName, minAge = personArr.get(1).age;
    let maxAgeName, maxAge = personArr.get(1).age;
    let averageAge = 0;
    
    
for (let i = 0; i < personArr.size; i++) {

    let personAge = personArr.get(i).age;
    
    averageAge += +personAge;
    
    if (personAge < minAge) {
        minAge = personAge;
        minAgeName = personArr.get(i).name;
        console.log()
    }
    
    if (personAge > maxAge){
        maxAge = personAge;
        maxAgeName = personArr.get(i).name;

    }
}

console.log(minAge, minAgeName);
console.log(maxAge, maxAgeName);
console.log(averageAge / personArr.size);
