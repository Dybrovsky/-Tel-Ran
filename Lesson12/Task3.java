// Task 3

// Реализовать метод, принимающий массив целых чисел, и возвращающий массив индексов четных значений полученного массива

public class Task3 {
    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3, 4, 5, 6, 7, 8, };

        // System.out.println(returnIndex(myArr));
        printArr(returnIndex(myArr));

    }

    static int[] returnIndex(int[] arr) {

        int[] result = new int[(arr.length) / 2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = 0; j < result.length; j++) {
                    result[j] = arr[i];
                    System.out.println(result[j]);
                }
            }

        }
        return result;

    }

    static int[] printArr(int[] arrPrint) {
        for (int i = 0; i < arrPrint.length; i++) {
            System.out.println(arrPrint[i]);
        }
        return arrPrint;
    }

}
