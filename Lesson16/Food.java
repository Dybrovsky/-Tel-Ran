
import java.util.Objects;

public class Food extends Goods {

    private String expDate;
    private double weight;

    public Food(String name, double price, String company, boolean isKosher, String expDate, double weight) {
        super(name, price, company, isKosher);
        this.expDate = expDate;
        this.weight = weight;
    }

    public Food() {
    }

    public String getExpDate() {
        return expDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
        final Food other = (Food) obj;
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        return Objects.equals(this.expDate, other.expDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Food{");
        sb.append("expDate=").append(expDate);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

}
