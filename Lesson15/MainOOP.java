
public class MainOOP {

    public static void main(String[] args) {

        // Alexey a = new Alexey();
        // System.out.println(a.calc(1, '*', 3));
        // Alexey.calc(3, '-', 1);

        Car.toFightFire();
        // String s = "";
        // String.valueOf(123);
        // s.trim();
        // String s = "anything";
        // String s1 = "12345";
        // int a = 5;
        // double d = 4.6;
        // char c = 'a';
        Car myCar = new Car();

        myCar.toDrive();

        System.out.println(myCar);
        System.out.println(myCar.brand);
        System.out.println(myCar.motor);
        System.out.println(myCar.year);
        System.out.println(myCar.isRight);

        myCar.brand = "Honda";
        System.out.println(myCar.brand);
        myCar.motor = 2.4;
        System.out.println(myCar.motor);
        myCar.year = 2020;
        System.out.println(myCar.year);
        myCar.isRight = false;
        System.out.println(myCar.isRight);

        Car davidCar = new Car();
        System.out.println(davidCar.year);
        davidCar.toStop();

        Car timurCar = new Car("Tesla", 10.5, false);
        System.out.println(timurCar.brand);
        System.out.println(timurCar.motor);
        System.out.println(timurCar.year);
        System.out.println(timurCar.isRight);

        Car milaCar = new Car("Mercedes", 6.3, 2021);
        System.out.println(milaCar.brand);
        System.out.println(milaCar.motor);
        System.out.println(milaCar.year);
        System.out.println(milaCar.isRight);

        Car ivanCar = new Car("VW Passat", 2.0);
        System.out.println(ivanCar.brand);
        System.out.println(ivanCar.motor);
        System.out.println(ivanCar.year);
        System.out.println(ivanCar.isRight);

        Car[] ar = { ivanCar, milaCar, timurCar, davidCar };
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i].brand + " ");
        }

    }

}
