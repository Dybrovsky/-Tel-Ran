
public class ThrowException {

    public static void main(String[] args) {

        try {
            System.out.println("Result is : " + calc(2, 'f', 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int calc(int a, char action, int b) throws Exception {

        int res = 0;
        switch (action) {

            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b != 0) {
                    res = a / b;
                } else {
                    Exception e = new Exception("Division by zero!");
                    throw e;
                }
                break;

            default:
                Exception e = new Exception("Wrong Action!");
                throw e;
        }
        return res;

    }

}
