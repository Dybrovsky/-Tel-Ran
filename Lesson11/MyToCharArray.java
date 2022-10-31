// Написать свой собственный метод myToCharArray(), переводящий String в массив char, 
// и возвращающий его.

public class MyToCharArray {

    public static void main(String[] args) {

        String s = "Hello";
        printArray(toCharAr(s));

    }

    static void printArray(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

    }

    static char[] toCharAr(String str) {

        char[] ch = new char[str.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }
}
