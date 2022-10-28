// Task 2

// Написать свой собственный метод myTrim(), удаляющий произвольное число пробелов в начале и конце строки, 
// и возвращающий строку без удаленных пробелов. При реализации myTrim() нельзя использовать метод trim().

public class MyTrim {
    public static void main(String[] args) {

        String str = "    H  ello    ";
        char[] resArr = str.toCharArray();
        String result = "";
        for (int i = 0; i < resArr.length; i++) {
            if (resArr[i] != 32) {
                result = result + resArr[i];
            }
        }

        System.out.println(result);
        System.out.println(result.length());
    }
    // String resultSt = resultArr.toString();

}
