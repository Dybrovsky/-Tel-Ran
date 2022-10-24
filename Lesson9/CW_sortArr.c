#include<stdio.h>
void printMax(int arr[], int size);
void swap(int arr[], int i);
int maxToEnd(int arr[], int size);
void sortBubble(int arr[], int size);
void printArr(int arr[], int size);

int main(){

    int arr[] = {2,0,8,4,3,9,1};

    printMax(arr, 7);
    sortBubble(arr, 7);
    printArr(arr, 7);
return 0;
}

void printMax(int arr[], int size){


    int max = arr[0];
    int i;
    for(i = 1; i < size; i++){

        if(arr[i] > max){
            max = arr[i]; // max = 9
        }
    }
    printf("Max is %d\n", max);
}

    // Bubble sort

    void swap(int arr[], int i){
        int tmp = 0;
        tmp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = tmp;
    }
    int maxToEnd(int arr[], int size){
        int i, flag = 0;
        for (i = 0; i < size - 1; i++){
            if (arr[i] > arr[i+1])
            swap(arr, i);
            flag = 1;
        }
    return flag;
    }

    void sortBubble(int arr[], int size){
        while(maxToEnd(arr, size));
    }

     void printArr(int arr[], int size){

    for(int i = 0; i < size; i++){
        printf("%d,", arr[i]);
      }
    }



/*
                                 sort
    int arr[] = {2,0,8,4,3,9,1};  ->   from min to max OR max to min
    
    swap(){

    temp = [i + 1] -> 0
    [i + 1] = [i] -> 2
    [i] = temp
    }





*/