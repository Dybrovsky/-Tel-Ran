// Task 4

// Реализовать метод: 
// public static void sortBubbleEvenOdd(int[] ar), 
// в который передать массив: ar -> [9][2][7][1][4][5][3] 
// который после сортировки должен принять вид:
//   ar -> [2][4][1][3][5][7][9]

public class Task4 {

    public static void main(String[] args) {

    }

    public static void sortBubbleEvenOdd(int[] mas) {

        for (int i = 0; i < (mas.length - 1); i++) {
            for (int j = 0; j < (mas.length - 1); j++) {

                // Расстановка по чётности
                if ((mas[j] % 2 == 1) && (mas[j + 1] % 2 == 0)) {
                    // swap
                    int buff = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = buff;
                }

                // Расстановка чётных по возрастнаию
                if ((mas[j] % 2 == 0) && (mas[j + 1] % 2 == 0)) {
                    if (mas[j] > mas[j + 1]) {
                        // swap
                        int buff = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = buff;
                    }
                }

                // Расстановка нечётных по возрастнаию
                if ((mas[j] % 2 == 1) && (mas[j + 1] % 2 == 1)) {
                    if (mas[j] > mas[j + 1]) {
                        // swap
                        int buff = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = buff;
                    }
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

}
