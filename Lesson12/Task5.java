// Task 5

// Реализовать метод:	
// public static int arrayEvenSumInRange(int[] ar, int s, int f), возвращающий сумму четных значений элементов 
// массива в заданном диапазоне индексов

public class Task5 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 2, 3 };
        int sortedArr = arrayEvenSumInRange(arr, 0, 5);
        System.out.println(sortedArr);
    }

    public static int arrayEvenSumInRange(int[] ar, int s, int f) {
        int sum = 0;
        for (int i = s; i < f; i++) {

            if (ar[i] % 2 == 0) {
                sum += ar[i];

            }
        }

        return sum;
    }
}
