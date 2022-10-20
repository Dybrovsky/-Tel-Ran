#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void printArray(int arr[], int size);
void printArrayFloat(float arr[], int size);
void fillArray(int arr[], int size, int min, int max);

int main(){

    srand(time(NULL));

    int temp1 = 0;
    temp1 = -34;
    // temp = -37;
    int temp2 = -37;

    // first way

    int temp[] = {-34, -37, -28, -15, temp1};

    printf("%d\n",temp[3]);

    int i;
    for(i = 0; i < 5; i+=2){
    printf("%d ",temp[i]);
    }

    // second way

    float arr[10] = {5.4};

    printArray(temp, 5);
    printArrayFloat(arr, 10);

    int size = 100, min = -100, max = 100;
    int arr1[size];

    fillArray(arr1, size, min, max);
    printArray(arr1, size);

return 0;
}

void printArrayFloat(float arr[], int size){
    printf("\n");
    int i;
    for(i = 0; i < size; i++){
        printf("%.2f ", arr[i]);
    }
    printf("\n");
}

void printArray(int arr[], int size){
    printf("\n");
    int i;
    for(i = 0; i < size; i++){
        printf("%d\n", arr[i]);
    }
    printf("\n");

}

void fillArray(int arr[], int size, int min, int max){

    int i;
    for(i = 0; i < size; i++){
        arr[i] = min + rand()%(max + 1 - min);
    
    }

}
/*
                0     1   2  3  4  5  6  7  8... index
int arr[]    [-34] [-37] [] [] [] [] [] [] []    length
arr[1] -> -37

*/