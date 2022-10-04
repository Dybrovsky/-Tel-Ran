#include <stdio.h>

int main()
{

    int a, b, c, d, res;

    // AND

    a = 0, b = 0;
    res = a && b;
    printf("res = %d\n", res);

    // OR

    c = 1, d = 1;
    res = c || d;
    printf("res = %d\n", res);

    // NOT

    a = 10000;
    res = !a;
    printf("res = %d\n", res);

    // COMPARISON

    a = 5;
    b = 3;
    res = a == b;
    printf("res = %d\n", res);

    // TERNARY

    a = 1, b = 6;

    // if(a == 4) {
    //     a = b;
    // } else {
    //     a = 5;
    // }
    // printf("a = %d\n, b = %d\n", a, b);

    a = (a == 4) ? b : 5;
    printf("a = %d, b = %d\n", a, b);

    return 0;
}