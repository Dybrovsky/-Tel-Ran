// let group = {
//     title: 'Masa2022-2023',
//     students: ['Tony', 'Artur', 'Ionatan'],
//     showList: function (){
//         const show = function (name)
//         {
//             console.log(`${this.title}: ${name}`)
//         }
//     this.students.forEach(show)
//     }
// }
//
// group.showList()

let group = {
    title: 'Masa2022-2023',
    students: ['Tony', 'Artur', 'Ionatan'],
    showList: function (){
        const show = (name) =>
        {
            console.log(`${this.title}: ${name}`)
        }
    this.students.forEach(show)
    }
}

group.showList()





// for (var i = 0; i < 10; i++) {
//     setTimeout(function () {
//         console.log(i);
//     }, 1000);
// }
//
// Проблема : он нам выведет на консоль 10 раз число 10.
//
// Что хотим мы : чтобы отрабатывал инкремент, и он вывел на консоль нам числа от 0 до 10. Способов решения несколько. Постарайтесь найти все, в том числе не используя let.


// #1
for (let i = 0; i <= 10; i++) {
    setTimeout(function () {
        console.log(i);
    }, 500);
}
setTimeout(()=>{console.log('============================')},600);

// #2
for (var h = 10; h > 0; h--) {
    setTimeout(function () {
        console.log(Math.abs(--h));
    }, 700);
}
setTimeout(()=>{console.log('============================')},700);

// #3

for (var j = 0; j <= 10; j++) {

    setTimeout(
        console.log.bind(console, j),1000);
}
setTimeout(()=>{console.log('============================')},1100);


