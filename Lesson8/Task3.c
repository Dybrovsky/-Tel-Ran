// Task 3

// Implement a function that returns copy values from array to another array

// void copyArr(int from[], int fromSize, int to[], int toSize);

// – If the array "from" is shorter than array "to",
// then it is necessary to fill the remainder in the second array with zeros
// – if the array "from" is longer than array "to",
// then you need to copy as many values as fit in the second array





#include<stdio.h>
void copyArr(int from[], int fromSize, int to[], int toSize);

int main(){

    int arr[] = {1, 2, 3, 4, 5};
    int fromSize = 5;
    int arr2[] = {0};
    int toSize = 9;


    copyArr(arr, fromSize, arr2, toSize);
    

    return 0;
}



void copyArr(int from[], int fromSize, int to[], int toSize){
    if (fromSize >= toSize){   
        int i;
        for(int i = 0; i < fromSize; i++){
        to[i] = from[i];
        }
    }

    if (fromSize < toSize){
        int i;
        for (i = 0; i < toSize; i++){
            if (i < fromSize){
                to[i] = from[i];
            }else{
                to[i] = 0;
            }
        }
    }
    int j;
    for(j = 0; j < toSize; j++){
printf("%d ",to[j]);
}

}