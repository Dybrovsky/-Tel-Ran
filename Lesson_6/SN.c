#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int isInRange(int num, int x, int y);
int isEqual(int num, int secretNumber);

int randomizer();
int randomizerInRange(int min, int max);
int scan();

int main()
{
	srand(time(NULL));


	int num = 0, x = 0, y = 0;

	printf("Enter lower border\n");
	x = scan();

	printf("Enter upper border\n");
	y = scan();

	int secretNumber = randomizer();
	secretNumber = randomizerInRange(x, y);
	printf("Secret number = %d\n", secretNumber);
	
	printf("Enter your number from %d to %d:\n", x, y);
	num = scan();
	printf("Your number is: %d\n", num);

	if (isInRange(num, x, y)) {
		if (isEqual(num, secretNumber))
		{
		printf("Congrats!\n");	
		} else {
		printf("Try again!\n");
		}

	} else {
		printf("Error!\n");
	}



    return 0;
}

int isInRange(int num, int x, int y){
	if(num < x || num > y) {
		return 0;
	} else {
		// isEqual(num, secretNumber);
		return 1;
	}
}

int isEqual(int num, int secretNumber){
	if(num == secretNumber) {
		return 1;
	} else {
		return 0;
	}
}

int randomizer(){
	return rand()%10; // random value from [0 to 9]
}

int randomizerInRange(int min, int max){
	return min + rand()%(max + 1 - min); // random value from (min to max)
}

int scan(){
	int input;
	fflush(stdout);
	scanf("%d", &input);
	return input;
}
// ddd