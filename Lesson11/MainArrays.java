public class MainArrays {

    public static void main(String[] args) {

        // int wagon[][] = { { 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0, 0
        // }, { 0 } };
        int[][] wagon = fillArray();
        printArray(wagon);
    }

    static int[][] fillArray() {

        int ar[][] = { { 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0, 0 }, { 0 } };

        for (int j = 0; j < ar.length; j++) {
            for (int i = 0; i < ar[j].length; i++) {
                ar[j][i] = (int) (Math.random() * 2);
            }
        }
        return ar;
    }

    static void printArray(int[][] ar) {
        for (int j = 0; j < ar.length; j++) {
            for (int i = 0; i < ar[j].length; i++) {
                System.out.print(ar[j][i] + " ");
            }
        }
        System.out.println();

    }
}