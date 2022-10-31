// Task 5
// Написать свой собственный метод myToString(), переводящий массив char в String, и возвращающий его.

public class myToString {
    public static void main(String[] args) {

        char[] ar = { 'H', 'e', 'l', 'l', 'o' };
        System.out.println(myToString(ar));

    }

    static String myToString(char[] ar) {

        return String.valueOf(ar);
    }
}