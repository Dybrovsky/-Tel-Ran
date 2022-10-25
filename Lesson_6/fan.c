#include<stdio.h>
int scan();
void fan(int mode);

int main(){

printf("Enter mode\n");
int mode = scan();

fan(mode);

return 0;    
}

void fan(int mode){

    switch (mode)
    {
        case 1 : printf("Speed 1\n"); break;
        case 2 : printf("Speed 2\n"); break;
        case 0 : printf("Switched off\n"); break;
        default : printf("Wrong mode\n");
    }
}

int scan(){
    int res;
    fflush(stdout);
    scanf("%d", &res);
    return res;
}



/*
switch(variable)
{

case value : statement; break;
case value : statement; break;
...
default : statement;
}

*/