#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void printArray(int ar[], int size);
void printArrayFloat(float ar[], int size);
void fillArray(int ar[], int size, int min, int max);
void concatArrays(int ar1[], int ar2[], int size1, int size2);

int main(){

	srand(time(NULL));

	int temp1 = 0;
	temp1 = -34;
	// temp = -37;
	int temp2 = -37;

	int temp[] = {-34, -37, -28, -15, temp1}; // first way

	printf("%d\n",temp[3]);
	printf("%x\n", temp);

	int i;
	for(i = 0; i < 5; i+=2){
		printf("%d ",temp[i]);
	}

	float ar[10] = {5.4}; // second way

	printArray(temp, 5);
	printArrayFloat(ar, 10);

	int size = 100, min = -100, max = 100;
	int ar1[size];

	fillArray(ar1, size, min, max);
	printArray(ar1, size);

	int arr1[] = {1,3,5,7,9};
	int arr2[] = {2,4,6,8};

	int size1 = sizeof(arr1)/sizeof(int);
	int size2 = sizeof(arr2)/sizeof(int);

	concatArrays(arr1, arr2, size1, size2);

return 0;
}

void printArrayFloat(float ar[], int size){
	printf("\n");
	int i;
	for(i = 0; i < size; i++){
		printf("%.2f ",ar[i]);
	}
	printf("\n");
}

void printArray(int ar[], int size){
	printf("\n");
	int i;
	for(i = 0; i < size; i++){
		printf("%d ",ar[i]);
	}
	printf("\n");
}

void fillArray(int ar[], int size, int min, int max){

	int i;
	for(i = 0; i < size; i++){
		ar[i] = min + rand()%(max + 1 - min);
	}

}

void concatArrays(int ar1[], int ar2[], int size1, int size2){

	int size3 = size1 + size2;
	int ar3[size3];

	int i;
	for(i = 0; i < size1; i++){
		ar3[i] = ar1[i];
	}
	for(i = 0; i < size2; i++){
		ar3[i + size1] = ar2[i];
	}
	printArray(ar3, size3);
}
/*
     	 	   0    1  2 3 4 5 6 7 8 9... index
 int ar[]	 [-34][-37][][][][][][][][]   length

 ar[1] -> -37




 */
