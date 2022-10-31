/*
 Написать свой собственный метод myTrim(), удаляющий произвольное число пробелов в начале и конце строки, и возвращающий строку без удаленных пробелов. При реализации myTrim() нельзя использовать метод trim().
 */
public class MyTrim {

    public static void main(String[] args) {

        String s = "     any string  ";
        System.out.println(s);
        System.out.println(myTrim(s));

    }

    static String myTrim(String str) {
        int start = 0, end = 0;
        char[] ch = str.toCharArray();
        // ch.length
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == ' ')
                continue;
            else {
                start = i;
                break;
            }
        }
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] != ' ') {
                end = i;
                break;
            } else {
                continue;
            }
        }

        return str.substring(start, end + 1);
    }

}

/*
 * i -> <- j
 * "     any string  " -> "any string"
 * ^ ^
 * start end
 * 
 * 0123456789 16 = length-1
 * 
 */