const base_url = 'https://webaccounting.herokuapp.com';


const btn = document.querySelector('button');
const login = document.querySelector('#login');
const password = document.querySelector('#password');

// btn.onclick = function (){
//     const log = login.value.trim()
//     const pas = password.value.trim()
//
//     fetch(`${base_url}/account/login`,
//         {
//             method: 'POST',
//             headers:
//                 {
//                     'Authorization': `Basic ${btoa(log+':'+pas)}`
//                 }
//         })
//         .then(response =>
//         {
//             if (response.status === 200)
//                 return response.json()
//             else
//                 throw new Error(''+response.status)
//         })
//         .then(user => console.log(user))
//         .catch(error => console.log(error))
// }

btn.onclick = async () => {
    try {
        const log = login.value.trim()
        const pas = password.value.trim()
        let response = await fetch(`${base_url}/account/login`,
            {
                method: 'POST',
                headers:
                    {
                        'Authorization': `Basic ${btoa(log + ':' + pas)}`
                    }
            })

        async function getData() {
            if (response.status === 200)
                return response.json()
            else
                throw new Error('' + response.status)
        }

        let data = await getData()
        console.log(data)
    }

