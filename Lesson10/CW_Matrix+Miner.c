#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void printMatrix(int n);
int scan();
// void fieldGenerator(int n, int arr[][]);
// void printArray(int n, int arr[][]);



int main(){
    srand(time(NULL));
    // printMatrix(7);
    int dim = 5;
    int field[dim][dim];
    // fieldGenerator(dim, field);
    // printArray(dim, field);

    
// filling out the arr with random values÷
    
    int i, j;
    for(j = 0; j < dim; j++){
        for(i = 0; i < dim; i++){
           field[j][i] = rand()%2;
        }
    }

// print the arr
    // int i, j;
    for(j = 0; j < dim; j++){
        for(i = 0; i < dim; i++){
            printf ("%d ", field[j][i]);
        }
        printf("\n");
    }

// user's dialog
    printf("Please, enter y, x\n");
    int y = scan();
    int x = scan();

// checking cell
    if(field[y][x]){
        printf("BOOM!\n");
    } else {
        printf("Lucky you!\n");
    }

    return 0;
}

    int scan(){
        int res;
        fflush(stdout);
        scanf("%d", &res);
        return res;
    }

void printMatrix(int n){
    int i, j;
    for(j = 0; j < n; j++){
        for(i = 0; i < n; i++){
            printf ("%d ", rand()%2);
        }
        printf("\n");
    }
}

// void fieldGenerator(int n, int arr[][]){
//     int i, j;
//     for(j = 0; j < n; j++){
//         for(i = 0; i < n; i++){
//            arr[j][i] = rand()%2;
//         }
//     }


// }

// void printArray(int n, int arr[][]){
//     int i, j;
//     for(j = 0; j < n; j++){
//         for(i = 0; i < n; i++){
//             printf ("%d ", arr[j][i]);
//         }
//         printf("\n");
//     }
// }

/*

i ->
j    0 1 0 1 0
|    0 0 1 0 1
     1 0 1 0 0
     1 0 0 1 1
     0 0 1 1 1

*/