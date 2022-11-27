
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
        for (Dish d : dishes) {
            System.out.println(d);
        }
        System.out.println("==============================");
    }

    public void saveMenuToFile(String folderPath) {

        String fileName = this.getRestaurantName() + ".txt";

        File folder = new File(folderPath);

        if (folder.exists() == false) {
            folder.mkdirs();
        }

        String filePath = folderPath + "/" + fileName;

        File file = new File(filePath);

        if (file.exists() == false) {
            try {
                file.createNewFile();

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for (Dish d : dishes) {
                    String toFile = d.getName() + "; "
                            + " price " + d.getPrice() + "; "
                            + " weight " + d.getWeight() + "; "
                            + " calories " + d.getCalories();
                    bw.write(toFile);
                    bw.newLine();
                }
                bw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public void readMenuFromFile(String folderPath) {
        File folder = new File(folderPath);

        if (folder.exists() == false) {
            System.out.println("pam param pam - noyp!");
        }

        String filePath = folderPath + "/" + this.getRestaurantName() + ".txt";

        File file = new File(filePath);

        if (file.exists() != false) {
            System.out.println("Noyp, no file!");
            return;
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }

                String[] arr = line.split("; ");
                String name = arr[0];
                double price = Double.parseDouble(arr[1]);
                double weight = Double.parseDouble(arr[2]);
                int calories = Integer.parseInt(arr[3]);

                Dish d = new Dish(name, price, weight, calories);

                this.addDish(d);

            }
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//		  
        for (Dish d : dishes) {
            System.out.println(d);
        }

    }

}

//    public void readMenuFromFile(String folderPath)
//    fileName - restaurantName +".txt"

