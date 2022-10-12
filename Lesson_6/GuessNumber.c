#include <stdio.h>
int isInRange(int secretNum, int num, int x, int y, int a);
int scan();

int main(){

    int secretNum = 5, num = 0, x = 0, y = 0; 
    int a = 0;
    printf("Please, enter u attachment\n");
    a = scan();
    int scan();
    printf("Please, enter start and end of the game range\n");
    x = scan();
    y = scan();
    printf("Please, enter u num behind %d and %d\n", x, y);
    num = scan();
    isInRange(secretNum, num, x, y, a);

}

int scan(){
	int input;
	fflush(stdout);
	scanf("%d", &input);
	return input;
}


int isInRange(int secretNum, int num, int x, int y, int a){

    while (num != secretNum){


        if (num < x || num > y){
            printf("Please enter num behind %d and %d\n", x, y);
        } 

        else if (num > secretNum){
            printf("The number is too big! Try again\n");
            a = a - 1; 
            printf("Attachment %d\n", a);
            
        } 

        else {
            printf("The number is too small! Try again\n");
            a = a - 1;    
            printf("Attachment %d\n", a);
        }

    }
          
          
          
          

            printf("You won!\n");
        
        return 1;

}  




