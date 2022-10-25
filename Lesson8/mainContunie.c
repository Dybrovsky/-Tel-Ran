#include<stdio.h>

int main(){

    int num = 1234567890, rem = 0;

    while(num > 0){
        rem = num % 10;
        num /= 10;

        if(rem % 2 != 0)
        continue;
        
            printf("%d ", rem);
        
    }

return 0;
}

