// Task 1

// Условие задачи:
//  - дорога на работу на различных видах транспорта занимает:
//    auto(1) -> 35 (min)
//    train(2) -> 47 (min)
//    bus(3) - 51 (min)
//    bike(4) -> 17 (min)
// - задержка из-за траффика в разное время дня для любого вида транспорта составляет:
//   6.00 - 8.00 -> 15 min
//   8.00 - 10.00 -> 32 min
//   10.00 - 12.00 -> 9 min
// Написать программу, запрашивающую у пользователя последовательно
// вид транспорта (int transport from 1 to 4) и время выезда (float time, например - 7.5 = 7h30m, 9.75 = 9h45m, etc.),
// и выводящую в Output:
// "Time to work at <time> for <transport> is: <...> minutes" где <time> и <transport> - значения, полученные от пользователя через консоль,
//  а <...> - расчетное время с учетом трафика.

#include <stdio.h>
float getTimeOnTransport(int transportCode);
float getDelay(float timeTrip);
void printResult(float time, int userTransport, float result);


int main()
{

    int userTransport;
    printf("Enter transport code: \n");
    scanf("%d", &userTransport);  
    
    float timeInput;
    printf("Enter time: \n");
    scanf("%f", &timeInput);  
    
    float time = getTimeOnTransport(userTransport);
    float delay = getDelay(timeInput);
    float result = time + delay;
    printResult(timeInput, userTransport, result);
        return 0;

}

float getTimeOnTransport(int transportCode)
{

    float timeOnTransport = 0;
    if (transportCode == 1){
        timeOnTransport = 35;
    }
    else if (transportCode == 2){
        timeOnTransport = 47;
    }
    else if (transportCode == 3){
        timeOnTransport = 51;
    }
    else if (transportCode == 4){
        timeOnTransport = 17;

    } else {
        printf("Wrong Transport!\n");
        return 0;
    }
    // printf("%.2f\n", timeOnTransport);
    return timeOnTransport;
}

float getDelay(float timeTrip)
{

    float timeDelay = 0;
    if (timeTrip >= 6 && timeTrip < 8){
        timeDelay = 15;
    }
    else if (timeTrip >= 8 && timeTrip <= 10){
        timeDelay = 32;
    }
    else if (timeTrip > 10 && timeTrip <= 12){
        timeDelay = 9;
    } else {
        printf("Wrong Time!\n");
        return 1;
    }

    // printf("%.2f\n", timeDelay);
    return timeDelay;
}

void printResult (float time, int transport, float result){
    printf("Time to work at " "%.2f" " for " "%d" " is " "%.2f\n", time, transport, result); 

}

