#include <stdio.h>

int function1();

int function2();

int function3();



int main()

{

    function1();

    return 1;

}



int function1()

{

    printf("firstTask");

    function2();

    function3();

    

    return 1;

}



int function2()

{
 const int aaa = 100;
    printf("\tsecondTask");

    return 1;

}



int function3()

{

    printf("\tRepeat");

    return 1;

}


