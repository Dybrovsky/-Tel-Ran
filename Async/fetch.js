fetch('https://jsonplaceholder.typicode.com/posts/1')
    .then(function (response) {
return response.json()
    })
.then(function (data){
    const h1 = document.createElement('h1')
    const h1text = document.createTextNode(data.title)
    h1.append(h1text)
    document.body.append(h1)
    
})
.catch(function (error){
    console.log(error)
})


fetch('https://jsonplaceholder.typicode.com/posts/2')
.then(response => response.json())
.then(data =>{
    const h1 = document.createElement('h1')
    const h1text = document.createTextNode(data.title)
    h1.append(h1text)
    document.body.append(h1)
})
.catch(error => console.log(error))