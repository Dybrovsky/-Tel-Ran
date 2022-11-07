public class MethodCalc {

    public static int calc(int a, char action, int b) {

        switch (action) {
            case '+':
                return sum(a, b);

            case '-':
                return dif(a, b);

            case '*':
                return mult(a, b);

            case '/':
                return div(a, b);

            default:
                return -1;
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int dif(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}