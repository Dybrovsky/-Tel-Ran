public class HourlyPayinfCustomer extends Customer {

    double payRate;
    int hours;

    @Override
    double calculatePay() {
        // TODO Auto-generated method stub
        return payRate * hours;
    }

    public HourlyPayinfCustomer(String name, boolean isFemale, double payRate, int hours) {
        super(name, isFemale);
        this.payRate = payRate;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyPayinfCustomer [payRate=" + payRate + ", hours=" + hours + "]";
    }

}