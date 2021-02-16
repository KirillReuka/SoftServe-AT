import java.util.ArrayList;

public class Chief {
    ArrayList<Vegetable> salad = new ArrayList<>();

    public void add(String name, String color, int weight, int calories) {
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

    public int getCalories() {
        return CaloriesCalculating.sumOfCalories(salad);
    }

    public void deleteByName(String vegetable) {
        salad.removeIf(v -> v.getName().equals(vegetable));
    }

    public void deleteByColor(String color) {
        salad.removeIf(v -> v.getColor().equals(color));
    }

    public void deleteByWeight(int from, int to) {
        salad.removeIf(v -> v.getWeight() >= from && v.getWeight() <= to);
    }

    public void deleteAllVegetables() {
        salad.clear();
    }
}
