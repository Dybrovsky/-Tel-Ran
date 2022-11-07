import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 5, b = 4, res = 0;
        char action = 0;

        System.out.println("Please enter first number ");

        a = scan.nextInt();

        System.out.println("Please enter action  ");

        action = scan.next().charAt(0);

        System.out.println("Please enter second number  ");

        b = scan.nextInt();

        res = MethodCalc.calc(a, action, b);

        System.out.println(a + "" + action + b + " = " + res);

        res = MethodCalc.sum(a, b);

        // System.out.println(a + " + " + b + " = " + res);

        res = MethodCalc.div(a, b);

        // System.out.println(a + " / " + b + " = " + res);

        res = MethodCalc.calc(a, '*', b);

        // System.out.println(a + " * " + b + " = " + res);
        scan.close();

    }
}