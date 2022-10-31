
public class Main {

    public static void main(String[] args) {

        int number = 43214321;
        System.out.println("Your control digit is " + countDigit(number));
        String num = "     43214321 ";
        num = num.trim();
        number = Integer.parseInt(num);
        System.out.println("Your control digit is " + countDigit(number));

        String card = "123456781234567"; // control digit?

        // number = Integer.parseInt(card);

    }

    static int countDigit(int num) {

        int count = 0, digit = 0, sum = 0, res = 0;
        do {
            digit = num % 10;
            num /= 10;
            if (count % 2 == 0)
                digit *= 2;
            if (digit > 9)
                digit -= 9;
            sum += digit;
            count++;
        } while (num > 0);

        res = 10 - sum % 10;

        // if(res == 10) res = 0;
        // else res = res;

        return (res == 10) ? 0 : res;
    }

}
