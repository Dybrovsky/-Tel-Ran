// Task 7
// Написать метод, определяющий - является ли слово палиндромом (читается с начала и конца одинаково)? Например, слово "level" является палиндромом, значит метод должен вернуть true. Дополнить метод проверкой, не зависящей от регистра букв в слове, так, что слово "Level" также является палиндромом.

public class Palindrom {
    public static void main(String[] args) {

        String input = "level";
        String check = "";

        int l = input.length();

        for (int i = 0; i < l; i++) {
            check = check + input.charAt(i);
        }
        // System.out.println(check);

        System.out.println(input.equalsIgnoreCase(check));
    }
}