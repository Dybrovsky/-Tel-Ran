#include <stdio.h>

int main()
{
    int a = 0, b = 5, res;

    if (a > 0 || a < 0)
    {
        res = b / a;

        printf("res = %d\n", res);
    }
    else
    {
        printf("Error!\n");
    }
    printf("The end!\n");

    if (a > 0)
    {
        res = a;
    }
    else if (b > 0)
    {
        res = b;
    }
    else if (res == 0)
    {
        res = a + b;
    }
    else
    {
        printf("Error!\n");
    }
    printf("res =%d\n", res);

    return 0;
}