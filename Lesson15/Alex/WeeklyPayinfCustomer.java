public class WeeklyPayinfCustomer extends Customer {

    double weeklyPayment;

    @Override
    double calculatePay() {
        // TODO Auto-generated method stub
        return weeklyPayment;
    }

    public WeeklyPayinfCustomer(String name, boolean isFemale, double weeklyPayment) {
        super(name, isFemale);
        this.weeklyPayment = weeklyPayment;
    }

    @Override
    public String toString() {
        return "WeeklyPayinfCustomer [weeklyPayment=" + weeklyPayment + "]";
    }

}