#include<stdio.h>
// void printASCIIwhile();
void printASCIIfor();
int main(){

//  printASCIIwhile();
 printASCIIfor();

}
void printASCIIwhile(){
    int start = 65, end = 122;
    char c = start;
    do{
        printf("code %d -> symbol %c \n", c, c);
        c++;
    }
    while(c<=end);
}

void printASCIIfor(){

int start = 65, end = 122, count = 0;
char c = start;

for (; c <= end; c++)
{
    printf("code %d -> symbol %c \n", c, c);
    count++;
    if(count == 3){
        printf("\n");
        count = 0;
    }
}

}