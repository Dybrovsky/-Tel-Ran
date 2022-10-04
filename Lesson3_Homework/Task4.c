// Написать программу, состоящую из функций f1-f4 (см.ниже), вызываемых из main(), выводящих в консоль "to be or not to be" в приведенном ниже формате (см. Output:):
/* main
 * int f1 -> to
 * int f2 -> be
 * int f3 -> or
 * int f4 -> not
 *
 * Output:
 *
 * to be
 * 		or not
 * to be
 */

#include <stdio.h>

void funcF1();
void funcF2();
void funcF3();
void funcF4();

void main()
{
    funcF1();
    funcF2();
    funcF3();
    funcF1();
    funcF2();
}

void funcF1()
{
    printf("\nto");
}

void funcF2()
{
    printf("\tbe");
}

void funcF3()
{
    printf("\n\t  or not");
}
