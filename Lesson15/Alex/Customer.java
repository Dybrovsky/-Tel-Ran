public class Customer {

    String name;
    boolean isFemale;
    String title;

    double calculatePay() {
        return 0.0;
    }

    public Customer(String name, boolean isFemale) {
        super();
        this.name = name;
        this.isFemale = isFemale;
        if (isFemale == true) {
            title = "Mrs.";
        } else
            title = "Mr.";
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", isFemale=" + isFemale + ", title=" + title + "]";
    }

}

    