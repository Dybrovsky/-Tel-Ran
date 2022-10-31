#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    srand(time(NULL));

                //   i   0 1   0 1 2 3 4...
    int wagon[][] = {{0,0},{0,0,0,0,0,0},{0,0,0},{0,0,0,0},{0}};
                  // j 0     1             2        3         4
    int j, i, sizeJ, sizeI;
    sizeJ = sizeof(wagon)/sizeof(int);
    printf("%d", sizeJ);
    for(j = 0;;){
        for(;;){
            wagon[j][i] = rand()%2;
        }
    }


    return 0;
}