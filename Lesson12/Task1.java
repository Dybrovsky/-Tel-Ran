// Task 1

// You are going to be given an array of integers. Your job is to take that array and find an index N
//  where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.
// 	For example:
// Let's say you are given the array {1,2,3,4,3,2,1}:Your function will return the index 3, 
// because at the 3rd position of the array, the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

public class Task1 {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6
        int[] MyArr = { 1, 2, 3, 4, 3, 2, 1 };
        // System.out.println(returnIndex(MyArr));
        System.out.println(returnIndex(MyArr));
    }


    static int returnIndex(int[] arr) {
        int left = 0, right = 0;

        for(int i = 0; i < arr.length; i++, left = 0, right = 0){
          for(int j = 0; j < i; j++){
            left += arr[j];
          }
          for(int k = arr.length - 1; k > i; k--){
            right += arr[k];
          }
          if(left == right) return i;  
        }
        return -1;
      }
}
