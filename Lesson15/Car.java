
public class Car {

    // 1. characteristics - fields - data members

    // String brand;
    // String year;
    // String motor;
    // String isRight;
    //
    // String[] carData = {brand, year, motor, isRight};

    String brand; // null
    int year = 2022; // 0
    double motor; // 0.0
    boolean isRight; // false

    // 2. constructors

    public Car() {
    } // default constructor

    public Car(String brand, double motor) {
        super();
        this.brand = brand;
        this.motor = motor;
    }

    public Car(String brand, double motor, boolean isRight) {
        super();
        this.brand = brand;
        this.motor = motor;
        this.isRight = isRight;
    }

    public Car(String brand, double motor, int year) {
        super();
        this.brand = brand;
        this.motor = motor;
        this.year = year;
    }

    // 3. functionality - methods
    // 3.1 class'es methods
    public static void toFightFire() {
        System.out.println("FightingFire");
    }

    // 3.2 object's methods
    public void toDrive() {
        System.out.println("Driving");
    }

    public void toStop() {
        System.out.println("Stopping");
    }

}

/*
 * 
 * Stack Heap
 * reference
 * Car myCar ---------------------------- address
 * object == instance == экземпляр класса
 * {
 * String brand = "Honda"; // 8 bytes
 * int year = 2020; // 4 bytes
 * double motor = 2.4; // 8 bytes
 * boolean isRight = false; // 1 byte
 * }
 * 
 * Car davidCar ---------------------------- address
 * {
 * String brand = "BMW";
 * int year = 2022;
 * double motor = 4.6;
 * boolean isRight = false;
 * }
 * 
 * int[] ar ---------------------------- address
 * {
 * ar[0] = 4
 * ar[1] = 9
 * ar[2] = 3
 * ar[3] = 5
 * }
 * 
 * 
 * 
 */