// Task 2

// Implements a function that will reverse array

// void reverseArr(int arr[], int size);

// Example:
// int main(){
//   int arr[] = {1,2,3,4,5,6,7,8,9,10};
//   reverseArr(arr,10);
//   printArr(arr,10);//on console -> [10][9][8][7][6][5][4][3][2][1]
//   return 0;
// }

public class ReverseArrJava {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        reverseArr(arr, 10);

    }

    static void reverseArr(int[] arr, int ArrSize) {

        int i, resVar;
        for (i = 0; i < ArrSize / 2; i++) {
            resVar = arr[i];
            arr[i] = arr[ArrSize - i - 1];
            arr[ArrSize - i - 1] = resVar;
        }

        for (i = 0; i < ArrSize; i++) {
            System.out.printf(" " + arr[i]);

        }
    }
}
