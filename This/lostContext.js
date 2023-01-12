class User{
    constructor(userName) {
        this.userName = userName
    }
    infoFunc = function (){
        console.log(this)
        console.log(`${this.userName}`)
    }
}

const tony = new User('Tony')
tony.infoFunc()

const name = tony.infoFunc.bind(tony);
name();

function printInfo(func){
    func()
}
printInfo(tony.infoFunc.bind(tony))
printInfo(tony.infoFunc.bind({userName: 'Ionatan'}))

// call apply

tony.infoFunc.call({userName: 'Sasha'});
tony.infoFunc.apply({userName: 'Sasha'});






