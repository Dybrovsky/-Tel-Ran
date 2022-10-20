#include<stdio.h>

int main(){
    int i = 0, j = 0, n = 10;
    for (j = 1; j < n; j++){
        for (i = 1; i < n; i++){
            printf("%d * %d = %d\t",i, j, i * j);
        }
        printf("\n");
    }


return 0;
}

/*
for(;;){
    for(;;){
        operators;
    }
}
1 2 3 4 5 6 7 8 9 // nested loop
1 2 3 4 5 6 7 8 9 
2 4 6 8 10 12...


9 18 27...   81


   
*/