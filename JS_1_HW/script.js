// Task 1

function xStatement(a, b) {
    let x = b / a;
    let res;

    if (a == 0 && b != 0) {
        res = 'no solution';
    } else if (a == 0 && b == 0) {
        res = 'solution is any number';
    } else {
        res = `x = ${x}`;
    }
    return res;

}

console.log(xStatement(10, 0))



// Task 3

let Str = 'Qwerty';

function reverseStr(string) {
    return res = string.split('').reverse().join('');
    
}

console.log(reverseStr(Str));


// Task 2


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


calculation();
