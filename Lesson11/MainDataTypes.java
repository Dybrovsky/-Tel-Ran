public class MainDataTypes {

    public static void main(String[] args) {

        int a = 5;
        Integer b = 7;
        System.out.println(a + b);
        b = a;
        a = b;

        String s = "123556435";
        int c = Integer.parseInt(s);
        System.out.println(c);

        String s1 = "123.45";
        double c1 = Double.parseDouble(s1);
        System.out.printf("%.2f", c1);
        System.out.println();
    }
}

/*
 * 
 * Wrappers
 * 
 * int <------>Integer
 * double <--->Double
 * boolean <-> Boolean
 * char <----> Character
 * 
 * 
 * 
 * 
 * 
 * 
 */