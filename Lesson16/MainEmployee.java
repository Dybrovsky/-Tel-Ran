
public class MainEmployee {

    public static void main(String[] args) {

        SalaryEmployee se1 = new SalaryEmployee(1, "Alex", 20, 1200);
        SalaryEmployee se2 = new SalaryEmployee(2, "Emil", 23, 5500);

        WageEmployee we1 = new WageEmployee(1, "Masha", 32, 20, 20);
        WageEmployee we2 = new WageEmployee(2, "Victor", 13, 25, 45);

        Manager mn1 = new Manager(1, "Nick", 21, 3500, 55);
        Manager mn2 = new Manager(2, "Sergo", 12, 3000, 25);

        Employee[] employees = {se1, se2, we1, we2, mn1, mn2, null, null, null, null};

        // print(employees);
        // printAdv(employees);
        printSuperAdv(employees);

    }

    public static void print(Employee[] employees) {

        int c = 1;
        for (Employee i : employees) {

            if (i != null) {
                System.out.println("\nEmployee" + c + i);
                c++;
            }
        }

    }

    public static void printAdv(Employee[] employees) {
        double Sum = 0;
        int c = 1;
        for (Employee i : employees) {

            if (i != null) {
                System.out.println("\nEmployee" + c + i);
                c++;
                Sum += i.calcSalary();
            }
        }

        System.out.println("-----------------");
        System.out.println("total salary: " + Sum);

    }

    public static void printSuperAdv(Employee[] employees) {
        double Sum = 0;
        int c = 1;
        double avr = 0.0;

        for (Employee i : employees) {

            if (i != null) {
                System.out.println("\nEmployee" + c + i);
                c++;
                Sum += i.calcSalary();
            }
        }

        avr = Sum / (c - 1); // c-1 - компенсируем то, что счетчик сразу начинается с 1

        System.out.println("-----------------");
        System.out.println("total salary: " + Sum);

        System.out.printf("average salary: %.1f", avr);

    }

}
