public class MainStringType {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);

        char[] c = { 'H', 'e', 'l', 'l', 'o' };
        System.out.println(c.length);

        System.out.println(s.length());

        s += ", world";
        System.out.println(s.length());

        System.out.println(s);

        System.out.println(c[4]);

        System.out.println(s.charAt(4));

        int[] ar = new int[10];

        String s1 = new String("Hi!");

        String s2 = "Hi!";
        String s3 = "Hi!";

        System.out.println(s1 == s2);
        System.out.println(s3 == s2);

        s3 = s;
        System.out.println(s3);

        System.out.println(s1.indexOf('!'));
        System.out.println(s.indexOf('l'));
        System.out.println(s.lastIndexOf('l'));

        System.out.println(s.contains("Hell"));

        System.out.println(s1.equals(s2));

        String s4 = "HI!";

        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String s5 = null;
        String s6 = "";

        String s7 = "       ";

        System.out.println(s6.isEmpty());
        System.out.println(s7.isBlank());

        String s8 = "        Hello, MASA!    ";

        System.out.println(s8.trim());

        String s9 = s8.replace('l', 'M').trim();
        System.out.println(s9);

    }

}