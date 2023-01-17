const base_url = 'https://jsonplaceholder.typicode.com'

const input = document.querySelector('input');
const btn = document.querySelector('button');

btn.onclick = function () {
    const value = input.value.trim();
    input.value = '';
    fetch(`${base_url}/users`)
        .then(response => response.json())
        .then(users => {
            const index = users.findIndex(user => user.username === value)
            return users[index].id
        })
        .then(id => fetch(`${base_url}/posts?userId=${id}`))
        .then(response => response.json())
        .then(posts => posts[0])
        .then(post => {
            const title = document.createElement('h1')
            title.append(document.createTextNode(`Title: ${post.title}`))
            const postBody = document.createElement('h3')
            postBody.append(document.createTextNode(`Body: ${post.body}`))
            document.body.append(title, postBody)
        })
        .catch(e => console.log(e))
}