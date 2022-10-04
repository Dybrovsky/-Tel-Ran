// Написать программу, состоящую из функций (см.ниже), вызываемых из main(), выводящих в консоль ответ в приведенном ниже формате (см. Output:).
// Условие задачи - каждый член семьи собрал некоторое количество яблок и сложил в корзину (basket), сколько стало кг яблок в корзине после каждого члена семьи? Сколько всего кг яблок в корзине?
//  * alex() -> 3.5 kg
//  * hanna() -> 5  kg
//  * max() ->   2.5 kg
//  * kate() ->  1.5 kg
//  * basket
//  * Output:
//  * After Alex: ?? kg
//  * ...
//  * After Kate: ?? kg
//  * Total in basket : ?? kg

#include <stdio.h>

void alex();
void hanna();
void max();
void kate();
float basket = 0;

int main()
{

    alex();
    hanna();
    max();
    kate();
    printf("\nTotal in basket: %.1f kg\n", basket);

    return 0;
}

void alex()
{
    basket = basket + 3.5;
    printf("after Alex: %.1f kg \n", basket);
}

void hanna()
{
    basket = basket + 5;
    printf("after Hanna: %.1f kg \n", basket);
}

void max()
{
    basket = basket + 2.5;
    printf("after Max: %.1f kg \n", basket);
}

void kate()
{
    basket = basket + 1.5;
    printf("after Kate: %.1f kg \n", basket);
}
