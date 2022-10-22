// Task 2

// Implements a function that will reverse array

// void reverseArr(int arr[], int size);

// Example:
// int main(){
//   int arr[] = {1,2,3,4,5,6,7,8,9,10};
//   reverseArr(arr,10);
//   printArr(arr,10);//on console -> [10][9][8][7][6][5][4][3][2][1]
//   return 0;
// }

#include<stdio.h>
void reverseArr(int arr[], int sizeArr);
void printArr(int arr[], int sizeArr);
int main(){

  int arr[] = {1,2,3,4,5,6,7,8,9,10};
  reverseArr(arr,10);
  printArr(arr,10);//on console -> [10][9][8][7][6][5][4][3][2][1]




    return 0;
}

void reverseArr(int arr[], int sizeArr){
     int i;
     int temp;

    for(int i = 0; i<sizeArr/2; i++){
        temp = arr[i];
        arr[i] = arr[sizeArr-i-1];
        arr[sizeArr-i-1] = temp;
    }
 }

    void printArr(int arr[], int sizeArr){

    for(int i = 0; i < sizeArr; i++){
        printf("%d,", arr[i]);
      }
    }
