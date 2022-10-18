#include<stdio.h>
int countKey(int num);
int main(){
    int number = 43214321;
    printf("Your control digit is %d\n", countKey(number));

    return 0;
}

int countKey(int num){
    int res = 0, digit = 0, sum = 0, count = 0;

    do{
        digit = num % 10;
        num /= 10;
        if(count % 2 == 0) digit *=2;
        if(digit > 9) digit -=9;
        sum += digit;
        count++;
    }
    while(num!=0);

    res = 10 - sum % 10;

    return (res == 10) ? 0 : res;
}