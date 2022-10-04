// Task 1
// Дописать программу Calculator - добавить функции, отвечающие за действия:
// - умножения
// - вычитания
// - вычисления произвольного процента от числа
// - возведения в квадрат

#include <stdio.h>
float add(float a, float b);
float div(float a, float b);
float mult(float a, float b);
float sub(float a, float b);
float percent(float a, float b);
float square(float a);

int main()
{
    printf("Result = %.2f\n", add(2, 3));

    printf("Result = %.2f\n", div(10, 2));

    printf("Result = %.2f\n", mult(2, 5));

    printf("Result = %.2f\n", sub(10, 3));

    printf("Result = %.2f\n", percent(100, 10));

    printf("Result = %.2f\n", square(4));
    return 0;
}
// сложение
float add(float a, float b)
{
    float res = 0;
    res = a + b;

    return res;
}
//   деление
float div(float a, float b)
{
    float res = 0;

    res = a / b;
    return res;
}
// умножение
float mult(float a, float b)
{
    float res = 0;
    res = a * b;
    return res;
}
// вычитание
float sub(float a, float b)
{
    float res = 0;
    res = a - b;
    return res;
}

// вычисления произвольного процента от числа
float percent(float a, float b)
{
    float res = 0;
    res = a / 100 * b;
    return res;
}

// - возведения в квадрат
float square(float a)
{
    float res = 0;
    res = a * a;
    return res;
}
