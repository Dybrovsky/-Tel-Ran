// Task 4

// 	Напишите программу пересчета расстояния из английской в метрическую систему мер, состоящую из функций перевода:

// - float mileToMeter(); - из миль в метры (1 миля (mile) = 1760 ярдов = 1.609 м)
// - float yardToMeter(); - из ярдов в метры (1 ярд (yard) = 3 футам = 0,9144 м)
// - float footToMeter(); - из футов в метры (1 фут (foot) = 12 дюймам = 0,3048 м)
// - float inchToMeter(); - из дюймов в метры (1 дюйм (inch) = 0,0254 м)

// В main() задается в виде отдельных переменных целочисленное количество миль, ярдов, футов, дюймов.
// Функции перевода принимают в себя целочисленные значение вышеуказанных переменных в соответствующих единицах измерения
// и возвращают рассчитанное дробное значение (4 знака после запятой) в метрах.
// Из main() вызывается функция void printResult(), которая:
// - принимает в себя в качестве аргументов целое количество миль, ярдов, футов, дюймов
// - вызывает соответствующие функции перевода
// - печатает рассчитанное дробное значение (4 знака после запятой) в метрах.

#include <stdio.h>
float mileToMeter(float Mile);
float yardToMeter(float Yard);
float footToMeter(float Foot);
float inchToMeter(float Inch);
void printResult();

int main()
{

    int Mile = 2;
    int Yard = 1;
    int Foot = 1;
    int Inch = 1;

    printResult(Mile, Yard, Foot, Inch);

    return 0;
}

float mileToMeter(float Mile)
{
    float res = Mile * 1.609;
    return res;
}

float yardToMeter(float Yard)
{
    float res = Yard * 0.9144;
    return res;
}
float footToMeter(float Foot)
{
    float res = Foot * 0.3048;
    return res;
}
float inchToMeter(float Inch)
{
    float res = Inch * 0.0254;
    return res;
}

void printResult(int MileMeters, int YardMeters, int FootMeters, int InchMeters)
{
    float Mile = mileToMeter(MileMeters);
    float Yard = yardToMeter(YardMeters);
    float Foot = footToMeter(FootMeters);
    float Inch = inchToMeter(InchMeters);

    printf("Mile to meter %.4f\n", Mile);
    printf("Yard to meter %.4f\n", Yard);
    printf("Foot to meter %.4f\n", Foot);
    printf("Inch to meter %.4f\n", Inch);
}
