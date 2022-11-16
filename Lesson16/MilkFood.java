
import java.util.Objects;

public class MilkFood extends Food {

    private String fat;
    private String milkType;

    public MilkFood() {
    }

    public String getFat() {
        return fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        return "MilkFood [fat=" + fat + ", milkType=" + milkType + "]";
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
        final MilkFood other = (MilkFood) obj;
        if (!Objects.equals(this.fat, other.fat)) {
            return false;
        }
        return Objects.equals(this.milkType, other.milkType);
    }

}
