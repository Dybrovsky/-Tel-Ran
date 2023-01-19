const from = document.querySelector("#from")
const to = document.querySelector("#to")
const sum = document.querySelector("#sum")
const btn = document.querySelector("button")
const resDiv = document.querySelector("#res")

const base_url = 'https://api.apilayer.com/fixer/latest?'
const api_key = 'N48w5P4hYI08zccNs9GQ0gge01nbq9ew'

btn.onclick = function () {
    const fromCurrency = from.value.trim().toUpperCase()
    const toCurrency = to.value.trim().toUpperCase()
    const sumValue = sum.value

    fetch(`${base_url}`,
        {
            headers:
                {
                    'apikey': api_key
                }
        })
        .then(response => response.json())
        .then(data => data.rates)
        .then(rates => {
            const result = rates[toCurrency] / rates[fromCurrency] * sumValue
            const resElem = document.createElement('h1')
            const resText = document.createTextNode(`Result: ${result.toFixed(2)}`)
            resElem.append(resText)
            if (resDiv.firstElementChild)
                resDiv.replaceChild(resElem, resDiv.firstElementChild)
            else
                resDiv.append(resElem)
        })
        .catch(e => console.log(e))
}