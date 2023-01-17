export class Person{
    constructor(id, name, age) {
        this.id = id
        this.name = name
        this.age = age
    }
    toString(){
        return JSON.stringify({
            id: this.id,
            name: this.name,
            age: this.age
        })
    }
}

const PI = 3.14
function test(){
    console.log('test')
}

export {PI, test as fun}

