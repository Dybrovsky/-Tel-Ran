// Task 2
// There is a code below that is a draft of the game "Guess secret number".
// 	Task 1. Implement function which is checking if the entered number
// is in range (0 - 9). If yes - should call the function from point 2.
// If not - should suggest to enter correct number.
// 	Task 2. Implement function which is checking if the entered number
// is equal to secretNumber. If yes - should congratulate user.
// If not - should suggest to try again.
// 	Task 3. Implement variable range with x and y as its boundaries in main().


#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int function2(int num, int secretNumber);
int validateNumber(int num, int secretNumber, int x);
int randomizer();

int main()
{
    srand(time(NULL));
	int secretNumber = randomizer();
    printf("Secret = %d\n", secretNumber);
	int num;

	printf("x\n");
    int x;
    fflush(stdout);
	scanf("%d", &x);
    validateNumber(num, secretNumber, x);
    
	printf("Enter your number from 0 to 9:\n");

	fflush(stdout);
	scanf("%d", &num);
    validateNumber(num, secretNumber, x);
    return 0;
}
int validateNumber(num, secretNumber, x){

    if (num < x || num > 9)
        {
            printf("Enter correct number!\n");
            main();
        } else 
        {
            function2(num, secretNumber); 
            
            return 0;
        }
}

int function2(num, secretNumber){
   if (num == secretNumber){
        printf("Congratulations!\n");
   } else {
        printf("Try again\n");
        main();    
}
}

int randomizer(){
    return rand()%10; //random value from [0 to 9]
}

