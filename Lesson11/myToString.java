// Task 5
// Написать свой собственный метод myToString(), переводящий массив char в String, и возвращающий его.

public class myToString {
    public static void main(String[] args) {

        char[] input = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String result = "";
        for (int i = 0; i < input.length; i++) {
            result = result + input[i];

        }
        System.out.println(result);

    }
}