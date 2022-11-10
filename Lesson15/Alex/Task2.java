public class Task2 {
    public static void main(String[] args) {

        WeeklyPayinfCustomer wpc = new WeeklyPayinfCustomer("John Snow", false, 5);
        HourlyPayinfCustomer hpc = new HourlyPayinfCustomer("Aria Stark", true, 3.5, 100);

        System.out.println(wpc);
        System.out.println(hpc);
    }
}