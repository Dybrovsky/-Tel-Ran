// Task 6
// Написать метод, определяющий начальный индекс самой длинной последовательности букв в строке. Например, для строки:

// 	String s = "aaaabbbccddddd"; индекс будет равен 9

public class Task6 {
    public static void main(String[] args) {

        String s = "aaaabbbccddddd";
        maxSubStrIndex(s);

    }

    static void maxSubStrIndex(String s) {

        int count = 0, max = 0;
        char sym = 0;
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
                if (count > max) {
                    sym = s.charAt(i);
                    max = count;
                }

            } else {
                count = 0;
            }
        }
        System.out.println(s.indexOf(sym));
    }
}
