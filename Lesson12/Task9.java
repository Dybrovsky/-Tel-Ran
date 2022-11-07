public class Task9 {
    public static void main(String[] args) {

    }

    static void parseYear(int year){

        int rem = 1000;

        do {
            rem /= 10;
            year /= 10;
        }
        
    }

    static char romanDigit(int i) {
        char roman = 0;
        switch (i) {
            case 1:
                roman = 'I';
                break;
            case 5:
                roman = 'V';
                break;
            case 10:
                roman = 'X';
                break;
            case 50:
                roman = 'L';
                break;
            case 100:
                roman = 'C';
                break;
            case 500:
                roman = 'D';
                break;
            case 1000:
                roman = 'M';
                break;
            default:
                roman = 0;
        }
        return roman;
    }
}