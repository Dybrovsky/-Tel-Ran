
import java.util.Objects;

public class Goods {
   private String name;
   private double price;
   private String company;
   private boolean isKosher;

    public Goods(String name, double price, String company, boolean isKosher) {
        this.name = name;
        this.price = price;
        this.company = company;
        this.isKosher = isKosher;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public boolean isKosher() {
        return isKosher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setKosher(boolean isKosher) {
        this.isKosher = isKosher;
    }

    @Override
    public String toString() {
        return "Goods [name=" + name + ", price=" + price + ", company=" + company + ", isKosher=" + isKosher + "]";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.company);
        hash = 37 * hash + (this.isKosher ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Goods other = (Goods) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.isKosher != other.isKosher) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.company, other.company);
    }

    
    


   
}