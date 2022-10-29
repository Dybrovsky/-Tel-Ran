// Написать свой собственный метод myToCharArray(), переводящий String в массив char, 
// и возвращающий его.

public class MyToCharArray {

    public static void main(String[] args) {

        String str = "Hello";
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        for (char c : result) {
            System.out.println(c);

        }

    }
}
