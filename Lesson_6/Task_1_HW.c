// Task 1
// Известно, что длина удава в попугаях = 38, в мартышках = 5, в слонёнках = 2. 

// https://youtu.be/p7ZBR2mIG9A

// Во все функции передать значения из функции main():
 
// 1) Объявить и описать функцию:

// int length (int measure);

// Передаем в функцию единицу измерения, в которой хотим измерить удава: 1 - в попугаях, 2 - в мартышках, 3 - в слонёнках, 
// функция возвращает значение длины удава в соответствии с выбранной единицей измерения. 


// 2) Объявить и описать функцию с применением if/else:

// void notification(int amount);

// Передаем в функцию полученную из первой функции длину удава, и:
// - если передана любая длина, отличная от вышеуказанных, печатаем в консоли: "I can't be measured in halves!" и выходим из функции
// - если длина = 38, печатаем в консоли:
// "In parrots your length is ... " - подставляем соответствующую длину удава в попугаях
// - если длина = 5, печатаем в консоли:
// "In monkeys your length is ... " - подставляем соответствующую длину удава в мартышках
// - если длина = 2, печатаем в консоли:
// "In elephants your length is ... " - подставляем соответствующую длину удава в слонёнках



#include<stdio.h>
int length (int measure);
int scan();
void notification(int snakeLengthResult);

int main(){

    printf("Enter measure\n");
    int measure = scan();
    int snakeLengthResult = length(measure);
    notification(snakeLengthResult);
    return 1;

}

int scan(){
    int res;
    fflush(stdout);
    scanf("%d", &res);
    return res;
}

int length (int measure) {
    int snakeLength = 0;
    switch (measure)
    {
        case 1 : snakeLength = 38; break;
        case 2 : snakeLength = 5; break;
        case 3 : snakeLength = 2; break;
       
    }
 
     return snakeLength;

}


void notification(snakeLengthResult){
    if (snakeLengthResult == 38)
        printf("In parrots your length is %.d\n", snakeLengthResult);
    else if (snakeLengthResult == 5)
        printf("In monkeys your length is %.d\n", snakeLengthResult);
    else if (snakeLengthResult == 2)
        printf("In elephnts your length is %.d\n", snakeLengthResult);
    else 
        printf("I can't be measured in halves!\n");
}


