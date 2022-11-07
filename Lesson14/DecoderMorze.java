public class DecoderMorze {

    public static void main(String[] args) {
        String[][] code = { { "A", ".-" }, { "B", "-..." }, { "C", "-.-." }, { "D", "-.." }, { "E", "." },
                { "F", "..-." }, { "G", "--." }, { "H", "...." }, { "I", ".." }, { "J", ".---" }, { "K", "-.-" },
                { "L", ".-.." }, { "M", "--" }, { "N", "-." }, { "O", "---" }, { "P", ".--." }, { "Q", "--.-" },
                { "R", ".-." }, { "S", "..." }, { "T", "-" }, { "U", "..-" }, { "V", "...-" }, { "W", ".--" },
                { "X", "-..-" }, { "Y", "-.--" }, { "Z", "--.." }, { " ", " " }, { "_", "_" }, { ".", ".-.-.-" },
                { ",", "--..--" }, { "!", "-.-.--" }, { "?", "..--.." } };
        String str = "Hello World!";

        String newStr = "".toUpperCase();
        for (int i = 0; i < str.length(); i++) {// coder
            if (str.charAt(i) == ' ') {
                newStr += "   ";
                System.out.println(str.charAt(i));
            } else
                for (int j = 0; j < code.length; j++) {
                    if (code[j][0].charAt(0) == str.charAt(i)) {
                        newStr += code[j][1];
                        newStr += " ";
                        break;
                    }
                }
        }
        System.out.println(newStr);

    }

}