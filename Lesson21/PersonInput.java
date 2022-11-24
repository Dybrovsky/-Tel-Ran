package ConsoleIO;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonInput {

    public static void main(String[] args) {

        ArrayList<Person> patients = new ArrayList<Person>();
        Scanner scan = new Scanner(System.in);
        String str;
        while (true) {
            try {
                patients.add(createPerson(scan));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            System.out.println("Add another person? Yes or no");
            str = scan.next();
            if (str.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println(patients);
        scan.close();
    }

    public static Person createPerson(Scanner scan) throws Exception {
        String name;
        int age, id;
        System.out.println("Enter name...");
        name = scan.next();
        System.out.println("Enter age...");
        try {
            age = scan.nextInt();
            System.out.println("Enter ID...");
            id = scan.nextInt();
        } catch (Exception e) {
            e = new Exception("Enter digits only!");
            throw e;
        }
        Person p = new Person(name, age, id);
        return p;
    }
}
