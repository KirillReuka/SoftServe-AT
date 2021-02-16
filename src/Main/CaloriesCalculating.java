import java.util.ArrayList;
import java.util.List;

public class CaloriesCalculating {

    public static double sumOfCalories(ArrayList<Vegetable> vegetableArrayList) {
        int sum = 0;
        for (Vegetable v : vegetableArrayList) {
            sum += v.getCalories();
        }
        return sum;
    }

}
