import java.util.ArrayList;

public class Chief {
    ArrayList<Vegetable> salad = new ArrayList<>();

    public void add(String name, String color, double weight, double calories) {
        Vegetable vegetable = new Vegetable(name, color, weight, calories);
        salad.add(vegetable);
    }

    public void showSalad() {
        if (salad.size() == 0) {
            System.out.println("Salad is empty");
        } else {
            System.out.println("Salad consists of: ");
            for (Object s : salad) {
                System.out.println(s.toString());
            }
        }
    }

    public double getCalories() {
        return CaloriesCalculating.sumOfCalories(salad);
    }

    public void deleteVegetable(String vegetable) {
        salad.clear();
    }

    public void deleteAllVegetables() {
        salad.clear();
    }
}
