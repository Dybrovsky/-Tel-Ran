// Task 3
// Дан массив соответствий букв и кодов Морзе.
// Реализовать методы кодер / декодер, исходя из следующих правил для записи кода Морзе:

// - буквы разделены между собой пробелом
// - слова разделены между собой тремя пробелами
// - при декодировании все буквы записываются в Upper Case

// public class MorseCode {

// 	public static void main(String[] args) {

// 		String[][] code = {
// 		        {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."},
// 		        {"E", "."}, {"F", "..-."}, {"G", "--."}, {"H", "...."},
// 		        {"I", ".."}, {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."},
// 		        {"M", "--"}, {"N", "-."}, {"O", "---"}, {"P", ".--."},
// 		        {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
// 		        {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"},
// 		        {"Y", "-.--"}, {"Z", "--.."}, {" ", " "}, {"_", "_"}, 
// 		        {".", ".-.-.-"}, {",", "--..--"}, {"!", "-.-.--"}, {"?", "..--.."}
// 		        };

public class Morze {
    public static void main(String[] args) {

        String[][] myCode = {
                { "A", ".-" }, { "B", "-..." }, { "C", "-.-." }, { "D", "-.." },
                { "E", "." }, { "F", "..-." }, { "G", "--." }, { "H", "...." },
                { "I", ".." }, { "J", ".---" }, { "K", "-.-" }, { "L", ".-.." },
                { "M", "--" }, { "N", "-." }, { "O", "---" }, { "P", ".--." },
                { "Q", "--.-" }, { "R", ".-." }, { "S", "..." }, { "T", "-" },
                { "U", "..-" }, { "V", "...-" }, { "W", ".--" }, { "X", "-..-" },
                { "Y", "-.--" }, { "Z", "--.." }, { " ", " " }, { "_", "_" },
                { ".", ".-.-.-" }, { ",", "--..--" }, { "!", "-.-.--" }, { "?", "..--.." }
        };

        sepArr(myCode);

    }

    // word > word[i] ==

    public static String[][] sepArr(String code[][]) {

        for (int j = 0; j < code.length; j++) {

            for (int i = 0; i < code[j].length; i++) {

                System.out.println(code[j][1]);
            }
        }
        // [0][0] - 'A'

        return code;
    }

}