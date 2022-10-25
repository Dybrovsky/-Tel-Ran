// Task 2
// 	Написать функцию int factorial(int number) для вычисления факториала целого числа в диапазоне [1 - 9], 
//     диапазон должен задаваться пользователем через консоль, также, как и число для расчета факториала с использованием цикла FOR:

// Output:
//   5! = 120

#include <stdio.h>
int factorial(int number);
int scan();

  int main(){
     int number;
     printf("Enter factorial\n");
     number = scan();
     if (number > 1 && number < 9)
     {
     factorial(number);
     } else 
     {
      printf("Choose number between 1 and 9");
     }
  }

  int factorial(int number){
     int i;
     float res = 1;
      for( i = 1; i <= number; i++ )
      res = i * res;
          printf("%.f\n", res);
      return 0;
  }

    int scan(){
	int input;
	fflush(stdout);
	scanf("%d", &input);
	return input;
}