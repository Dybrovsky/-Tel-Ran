// Task 4

// Реализовать метод: 
// public static void sortBubbleEvenOdd(int[] ar), 
// в который передать массив: ar -> [9][2][7][1][4][5][3] 
// который после сортировки должен принять вид:
//   ar -> [2][4][1][3][5][7][9]

public class Task4 {

    public static void main(String[] args) {
        int ar[] = { 9, 2, 7, 1, 4, 5, 3 };
        sortBubbleEvenOdd(ar);
    }

    public static void sortBubbleEvenOdd(int[] ar) {
        int tmp = 0;
        boolean flag = false;

        do {
            flag = false;
            for (int i = 0; i < ar.length - 1; i++) {

                if ((ar[i] > ar[i + 1]) && (ar[i] % 2 != 0)) {
                    tmp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = tmp;
                    flag = true;
                }

            }
        }

        while (flag);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

}
