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

        // printf("Please enter num behind %d and %d\n", x, y);

int isInRange(int secretNum, int num, int x, int y, int a){

    while(num > x && num < y){
		printf("You have %d attempts\n", a);
		fflush(stdout);
		scanf("%d", &num);
		a--;
	if(num == secretNum){
		printf("YOU WON!!!"); break;
	}else if(a == 0){
		printf("YOU LOST!!!"); break;
	}else if(num < x || num > y){
		printf("Please, enter a number from %d to %d\n", x, y);
	}else if(num > secretNum){
		printf("The number is too big! Try again!\n");
	}else if(num < secretNum){
		printf("The number is too small! Try again!\n");
	}
}
        return 0;
          
}  
          
          
          

        





