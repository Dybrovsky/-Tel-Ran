#include <stdio.h>

void Function1();
void Function2();
void Function3();

int main()
{

    Function3();

    Function1();

    Function3();
}

void Function1()
{
    printf("Function1\n");
    Function2();
}

void Function2()
{
    printf("Function2\n");
    Function3();
}

void Function3()
{
    printf("Function3\n");
}
