// 1. Write a function that will tell if your string is a palindrome. The string will be entered through
// prompt(). The result will be output through alert()


// let string = prompt("your string");


function isPalindrome(str) {
    return alert(str.toLowerCase().split("").reverse().join("") === str.toLowerCase() ? 'String is a palindrome!' : 'String is not a palindrome');

}

// console.log(isPalindrome(string));


//
// 2. Write a function that will do mathematical operations. The operator and operands are also
// entered
// using prompt(), and the result is displayed using an alert()


function calculation() {
    const operand1 = prompt('first operand?', '');
    const operator = prompt('operation', '');
    const operand2 = prompt('second operand?', '');

    if (isNaN(operand1) || isNaN(operand2)) {
        alert('Not a number!')
    } else if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
        alert('Not an operation!')
    } else {

        switch (operator) {
            case '-' :
                alert(operand1 - operand2);
                break;
            case '+' :
                alert(+operand1 + +operand2);
                break;
            case '*' :
                alert(operand1 * operand2);
                break;
            case '/' :
                if (operand2 == 0) {
                    alert('Do not division on zero!!!')
                    break;
                } else {
                    alert(operand1 / operand2);
                }
                break;
        }
    }
}


// calculation();

// Write function arrayCopy that gets the following parameters : function
// arrayCopy(src,srcPos,dst,dstPos,length) {....}
// where: src - source array, 
// srcPos - index of the source array, 
// dst - array destination, 
// dstPos - index of destination array,
// length - number of elements.
// This function should copy length elements from src array beginning from
// srcPos index to dst array from dstPos index
// Apply the following array functions (
//     splice and slice)

let src = [1, 2, 3, 4, 5, 6];
let dst = ['a', 'b', 'c', 'd', 'e', 'f'];

function arrayCopy(src, srcPos, dst, dstPos, length) {

    let temp = src.slice(srcPos, srcPos + length);
    dst.splice(dstPos, length, ...temp);

}

arrayCopy(src, 1, dst, 1, 2);
console.log(dst);


// Write function displayOccurrences(array)
// Array contains the repeated strings, for example [‘abc’, ‘lmn’, ‘abc’, ‘lmn’,’lmn’, ‘prst’, ‘ab’]
// The function should display out the words and how many times each word is encountered in th
// e array in
// the format as shown below. The words order isn’t defined. For example:
//     abc - >2
// lmn - > 3
// prst - >1
// ab - >1

let array = ['abc', 'lmn', 'abc', 'lmn','lmn', 'prst', 'ab'];

function displayOccurrences(array) {
let res = {};

    // for (let word of array) {
    //     if(res[word])
    //         res[word]++
    //     else
    //         res[word] = 1
    // }
    //
    array.forEach(function (word)
    {
        let count = res[word] || 0
        res[word] = count + 1
    })
    for (let entry of Object.entries(res)) {
        console.log(entry[0] + '->' + entry[1])
    }
}

console.log(displayOccurrences(array));


// Write function ulSurround that surrounds array of strings inside <ul></ul> element.
// 1.
// Example of input array
// var strings=["abc","lmn","cd"]
// Output array for the above example -
// var ulSurrounding=ulSurround(strings)
//     ["<ul>","<li>abc</li>","<li>lmn</li>","<li>cd</li>","</ul>"]
// Apply the array functions: splice and map

let strings=["abc","lmn","cd"];

function ulSurround(ar) {


    for (let el of ar) {
        let res = ar.map(function (el){
            return "<li>" + el + "</li>"
        });
    res.splice(0,0,"<ul>");
    res.splice(ar.length+1,0,"</ul>");
    return res;
    }


}

console.log(ulSurround(strings));




