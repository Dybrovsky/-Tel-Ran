console.log(this);

const nameFunc = function (){
    console.log(this);
    return `${this.firstName} ${this.lastName}`
}

const artur = {
    firstName: 'Artur',
    lastName: 'Bayanov'
}

const tony = {
    firstName: 'Tony',
    lastName: 'Sever'
}

artur.fullName = nameFunc
tony.fullName = nameFunc

console.log(artur);
console.log(artur.fullName());
console.log(tony.fullName());

console.log(nameFunc())



