
public class Dish implements Comparable<Dish> {

    private String name;
    private double price;
    private double weight;
    private int calories;

    public Dish(String name, double price, double weight, int calories) {
        super();
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.calories = calories;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "\n\n\n" + name
                + " \n\nprice = " + price
                + " \nweight = " + weight
                + " \ncalories = " + calories;
    }

    @Override
    public int compareTo(Dish o) {
        return this.getName().compareToIgnoreCase(o.getName());

    }

}
