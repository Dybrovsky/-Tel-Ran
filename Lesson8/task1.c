#include<stdio.h>

int main(){
int i = 0, j = 0, n = 10, m = 7;
for(j = 0; j < n; j++){
        for(i = 0; i < m; i++){

            if(i == 0 || i == n-1 || j == 0 || j == m-1
            || i == j || i + j == n - 1){
                printf("* ");
            } else {
                printf("  ");
            }


        }
        printf("\n");
    }


    return 0;
}



