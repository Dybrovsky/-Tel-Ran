// function sleep(timeout, fn){
//     let running = true;
//     setTimeout(fn, timeout)
// }
//
// sleep(1000, function (){
// console.log('After 1000 mls')
// })

// 2015
function sleep(timeout) {
    return new Promise(function (resolve) {
        setTimeout(function () {
            resolve()
        }, timeout)
    })
}

sleep(1000).then(function () {
    console.log('After 1000 mls')
})
// JAVA
// let id = getId()
// let user = getUser(id)
// console.log(user)


// function getID(maxId, fn, fn1){
//     setTimeout(function (){
//         let id = Math.round(Math.random()*maxId)
//         fn(id, fn1)
//     }, 1000)
// }
//
// function getUser(id, fn){
//     setTimeout(function (){
//         let user = {id, name: 'Ionatan'} //id:id
//         fn(user)
//     }, 1000)
// }
//
// function displayUser(user){
//     console.log(user)
// }
//
// getID(100, getUser, displayUser)

function getId(maxId) {
    return new Promise(function (resolve) {
        setTimeout(function () {
            let id = Math.round(Math.random() * maxId)
            resolve(id)
        }, 1000)
    })
}

function getUser(id) {
    return new Promise(function (resolve) {
        setTimeout(function () {
            let user = {id, name: 'Ionatan'} //id:id
            resolve(user)
        }, 1000)
    })
}

function displayUser(user) {
    console.log(user)
}

function displayError() {
    console.log('Error')
}

getId(100).then(getUser).then(displayUser).catch(displayError)