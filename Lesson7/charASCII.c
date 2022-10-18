#include<stdio.h>
void printASCII();

int main(){

 printASCII();

}
void printASCII(){
    int start = 65, end = 122;
    char c = start;
    do{
        printf("code %d -> symbol %c \n", c, c);
        c++;
    }
    while(c<=end);
}
