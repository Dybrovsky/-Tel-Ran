#include<stdio.h>
void printIndex(int arr[], int number);
int binarySearch(int arr[], int number, int size);

int main(){

    int arr[] = {0,1,2,3,4,8,9};
    printIndex(ar, 5, 7);


    return 0;
}

void printIndex(int arr[], int number){

    int i = binarySearch(arr, number);
    if(i < 0 || i > size){
        printf("This num doesnt exist in the arr\n");
    } else {
        printf("This num exist in the arr\n");
    }
}

int binarySearch(int arr[], int number, int size){

    int left = 0, right = size - 1, middle = (left + right) / 2;

    while(left < right && arr[middle] != number ){

    if (number < arr[middle]){
        right = middle - 1;
        } else {
        left = middle + 1;
        }
        middle = (left + right) / 2;
        }
    return left <= right ? middle : -1;
}
/*
            left  middle  right 
int arr[] = {0, 1, 2, 3, 4, 8, 9};



*/