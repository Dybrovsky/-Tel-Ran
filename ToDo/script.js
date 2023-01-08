const item = document.querySelector('#item');
const btnAdd = document.querySelector('#addItem');
const list = document.querySelector('#todoList');

// console.log(liItem);

btnAdd.addEventListener('click', function () {
    let liItem = document.createElement('Li');
    let checked = document.createElement('button');
    let x = document.createTextNode('X');
    checked.append(x);
    const text = document.createTextNode(`${item.value}`);
    checked.className = 'btn';
    liItem.append(text);
    liItem.append(checked);
    list.append(liItem);
   
    checked.addEventListener('click', function (){
        liItem.remove() 
    });

});

