mport java.awt.DisplayMode;
import java.util.TreeSet;

public class MainRestaurant {

    public static void main(String[] args) {

        RestaurantMenu rm = new RestaurantMenu("Malibu", "Amsterdam");
        String filePath
                = "/Users/seversever/eclipse-workspace/_testwrite/testfolder"
                + RestaurantName + ".txt";

        Dish d1 = new Dish("Fish&Cheaps", 100.5, 350.0, 500, 1);
        Dish d2 = new Dish("Floopy Chicken", 120, 370.0, 550, 2);
        Dish d3 = new Dish("Salmon Steak", 220.5, 450.5, 750, 3);
        Dish d4 = new Dish("Pineapple Rice", 110.5, 370.0, 555, 4);
        Dish d5 = new Dish("Pulled Pork", 180.5, 400.0, 450, 5);

        rm.addDish(d1);
        rm.addDish(d2);
        rm.addDish(d3);
        rm.addDish(d4);
        rm.addDish(d5);

        rm.removeDish("Fish&Cheaps");
        rm.display();

    }

}
