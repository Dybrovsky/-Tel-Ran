// Task 3

// 	Написать программу вычисления величины дохода по вкладу.
// Значения для формулы расчета задаются в переменных в функции main().

// Формулу расчета оформить в отдельную функцию, вызываемую из main():

// ДоходПоВкладу = (СуммаВклада * СтавкаВПроцентах * СрокВкладаВДнях / КоличествоДнейВГоду) / 100

#include <stdio.h>
float Profit(float Sum, float Percent, float Time, float Days);

int main()
{

    float Sum = 1000;
    float Percent = 3;
    float Time = 30;
    float Days = 365;

    float result = Profit(Sum, Percent, Time, Days);

    printf("Profit is %.2f", result);

    return 0;
}

float Profit(float Sum, float Percent, float Time, float Days)
{

    float res = (Sum * Percent * Time / Days) / 100;

    return res;
}
