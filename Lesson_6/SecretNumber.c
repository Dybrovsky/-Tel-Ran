#include <stdio.h>
int function2(int num, int secretNumber);
int validateNumber(int num, int secretNumber);


int main(){
	int secretNumber = 5;
	int num;
    
	printf("Enter your number from 0 to 9:\n");

	fflush(stdout);
	scanf("%d", &num);
    validateNumber(num, secretNumber);
    return 0;
}
int validateNumber(num, secretNumber){

    if (num < 0 || num > 9)
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