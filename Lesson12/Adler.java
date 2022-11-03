public class Adler {
    public static void main(String[] args) {
        int[] mas = new int[]{9, 2, 7, 1, 4, 5, 3};
        int min = 1;
        int max = 4;
        reverseInRange(mas, min, max);
    }

    //    Реализовать метод :
//    public static void reverseInRange(int[] ar, int s, int f),
//    разворачивающий в обратном порядке часть элементов массива в заданном диапазоне индексов
    public static void reverseInRange(int[] ar, int min, int max) {
        for (int i = ar.length - 1; i >= 0; i--) {
            if (i > min && i < max) {
                System.out.printf("%d", ar[i]);

            }

        }
    }
}