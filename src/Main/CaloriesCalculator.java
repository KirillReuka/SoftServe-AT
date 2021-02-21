import java.util.ArrayList;

public class CaloriesCalculator {

    public static int sumOfCalories(ArrayList<Vegetable> vegetableArrayList) {
        int sum = 0;
        for (Vegetable v : vegetableArrayList) {
            sum += v.getCalories();
        }
        return sum;
    }

}
