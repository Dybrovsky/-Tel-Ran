// Task 3

// Написать свой собственный метод myUpperCase(), переводящий символы строки в верхний регистр,
//  и возвращающий строку, состоящую из всех заглавных букв.
//   При реализации myUpperCase() нельзя использовать метод upperCase().

public class MyUpperCase {

    public static void main(String[] args) {

        String s = "hello world";
        System.out.println(myUpperCase(s));
        // char[] tempAr = str.toCharArray();
        // String result = "";

        // // System.out.println(tempAr);
        // for (int i = 0; i < tempAr.length; i++) {
        // int code = tempAr[i] - 32;
        // result = result + Character.toString(code);
        // }
        // System.out.println(result);

        // System.out.println();
    }

    static String myUpperCase(String str) {

        // String res = "";
        for (int i = 0; i < str.length(); i++) {

            char oldChar = str.charAt(i);
            char newChar = (char) (oldChar - ('a' - 'A')); /* !!!! casting */
            if (oldChar >= 'A' && oldChar <= 'Z' || oldChar == ' ')
                continue;
            str = str.replace(oldChar, newChar);
            // System.out.println(str);
        }
        return str;

    }

}
