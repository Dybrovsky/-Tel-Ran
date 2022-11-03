// Реализовать метод:
// public static void reverseInRange(int[] ar, int s, int f), разворачивающий в обратном порядке часть элементов массива 
// в заданном диапазоне индексов

public class Task6 {
    public static void main(String[] args) {
        int[] ar = { 9, 2, 7, 1, 4, 5, 3 };
        reverseInRange(ar, 0, 6);
        printArray(ar);

    }

    public static void reverseInRange(int[] ar, int s, int f) {

        for (int i = ar.length - 1; i >= 0; i--) {
            if (i > s && i < f)
                System.out.print(ar[i] + " ");

        }
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

}
