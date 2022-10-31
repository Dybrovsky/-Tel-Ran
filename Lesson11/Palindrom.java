// Task 7
// Написать метод, определяющий - является ли слово палиндромом (читается с начала и конца одинаково)? Например, слово "level" является палиндромом, значит метод должен вернуть true. Дополнить метод проверкой, не зависящей от регистра букв в слове, так, что слово "Level" также является палиндромом.

public class Palindrom {
    public static void main(String[] args) {
        String s = "Level";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }

}
