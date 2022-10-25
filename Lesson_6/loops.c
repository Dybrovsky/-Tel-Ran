#include<stdio.h>
void printReverse(int num);
void WhileDoWhile();

int main(){

    int a = 5, count = 0;
    while (a > 0){
        printf("%d\n", a);
        if(count == 4) break;
        count++;
    }
    printf("End\n");

    a = 36041642;
    printReverse(a);
    WhileDoWhile();

return 0;
}

/*
while(condition){
    operators;
}
*/

void printReverse(int num){
    int rem;
    while (num > 0)
    {
      rem = num % 10;
      printf("%d", rem);
      num /= 10;  
    }
}

void printReverseDo(int num){
    int rem;
    do{
      rem = num % 10;
      printf("%d", rem);
      num /= 10; 
    }
    while (num > 0);
}

void WhileDoWhile(){
    printf("\n");
    int a = 5;
    while (a > 0)
    {
        printf("%d", a--);
    }
    printf("\n");
    a = 5;
    do{
        printf("%d", a--);
    }
    while (a > 0);
    printf("\n");
}

