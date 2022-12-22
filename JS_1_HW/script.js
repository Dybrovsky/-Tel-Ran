function xStatement(a, b) {
    let x = b / a;
    let res;

    if (a == 0 && b != 0) {
        res = 'no solution';
    } else if (a == 0 && b == 0) {
        res = 'solution is any number';
    } else {
        res =`x = ${x}`;
    }
    return res;

}

console.log(xStatement(10, 0))


function calculation() {
    const operand1 = prompt('first operand?', '');
    const operand2 = prompt('second operand?', '');
    const operator = prompt('operation', '');
    switch (operator) {
        case '-' : alert (operand1 - operand2);
        break;
        case '+' : alert (+operand1 + +operand2);
        break;
        case '*' : alert (operand1 * operand2);
        break;
        case '/' : alert (operand1 / operand2);
        break;
        

    }
}

calculation();

