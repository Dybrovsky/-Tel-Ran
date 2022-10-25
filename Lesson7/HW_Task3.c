// Task 3
// 	Написать функцию int XpowerY(int x, int y) для вычисления числа x в степени y (оба только положительные в диапазоне [1 - 9]) с использованием цикла FOR:

// Output:

//   x = 2  y = 3

//   2 in power 3 = 8

#include <stdio.h>
int XpowerY(int x, int y);
  int main(){
    XpowerY(2, 3);
}

int XpowerY(int x, int y){
 if (x >= 1 && x <= 9 && y >= 1 && y <= 9){

    int i;
    int res = x;
    for (i = 1; i < y; i++){
        res = res * x;
    }
        printf("%.d\n", res);
    return res;

 } else {
    printf("Not in range\n");
    return 0;
 }
 return 0;
}
    //   int i;
    //   int n = 5;
    //   for( i = 0; i < n; n-- )
    //       printf("*");
    //   return 0;
