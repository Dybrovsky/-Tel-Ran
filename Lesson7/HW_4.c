#include <stdio.h>
    void decToBin(int num);
  int main(){
    decToBin(11);
      return 0;
  }

  void decToBin(int num){
    int bit = 0, shift = 1;

    do{
        bit += (num % 2) * shift;
        shift *= 10;
        num /= 2;
    }
    while(num > 0);
    printf("%d\n", bit);



  }