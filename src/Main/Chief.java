import java.util.ArrayList;

public class Chief {
    ArrayList<Vegetable> salad = new ArrayList<>();

    public void add(String name, String color, double weight, double calories) {
        Vegetable vegetable = new Vegetable(name, color, weight, calories);
        salad.add(vegetable);
    }

//    public ArrayList<Vegetable> getSalad() {
//        return salad;
//    }

    public void showSalad() {
        System.out.print("Salad consists of: ");
        for (Object s : salad) {
            System.out.println(s.toString());
        }
    }

    public double getCalories() {
        return CaloriesCalculating.sumOfCalories(salad);
    }
}
