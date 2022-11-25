
import java.io.*;
import java.util.*;

public class RestaurantMenu {

    private String restaurantName;
    private String location;

    TreeSet<Dish> dishes = new TreeSet<Dish>();

    public RestaurantMenu(String restaurantName, String location) {
        super();
        this.restaurantName = restaurantName;
        this.location = location;
//		this.dishes = dishes;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//	public TreeSet<Dish> getDishes() {
//		return dishes;
//	}
//
//
//	public void setDishes(TreeSet<Dish> dishes) {
//		this.dishes = dishes;
//	}
//
    @Override
    public String toString() {
        return "RestaurantMenu [restaurantName=" + restaurantName + ", location=" + location + ", dishes=" + dishes
                + "]";
    }

    public void addDish(Dish d) {
        if (dishes.contains(d) == false) {
            dishes.add(d);

            System.out.println(d.getName() + " added successfully");
            return;
        }
        System.out.println("Dish " + d.getName()
                + " already exists"
        );
        return;
    }

    public void removeDish(String name) {
        for (Dish d : dishes) {
            if (d.getName() == name) {
                dishes.remove(d);
                System.out.println("Dish with name " + d.getName()
                        + " successfully removed");
                return;
            }
        }
        System.out.println("Dish with name " + name
                + " is not present");
    }

    public void display() {
        System.out.println("==============================");
        System.out.println("Restaurant name : " + restaurantName
                + "\nOur location: " + location
                + "\nOur dishes: " + dishes
        );
//		for(Dish d : dishes) {
//			System.out.println(d.getName());
//		}
        System.out.println("==============================");
    }

//    public void saveMenuToFile(String folderPath) 
//    public void readMenuFromFile(String folderPath)
//    fileName - restaurantName +".txt"
}
