#include <stdio.h>
void taxi(int code);

int main()
{

    int code = 0;
    printf("Enter code\n");

    fflush(stdout);
    scanf("%d", &code);

    taxi(code);

    return 0;
}

void taxi(int code)
{

    if (code < 1 || code > 3)
    {
        printf("Error, wrong code!");
        return;
    }

    if (code == 1)
    {
        printf("Haim, Go!!!\n");
    }
    if (code == 2)
    {
        printf("David, Go!!!\n");
    }
    if (code == 3)
    {
        printf("Ashot, Go!!!\n");
    }
}