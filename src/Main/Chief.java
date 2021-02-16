import java.util.ArrayList;
import java.util.Comparator;

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

    public void sortingByWeight() {
        salad.sort(Comparator.comparing(Vegetable::getWeight).reversed());
    }

    public void sortingByCalories() {
        salad.sort(Comparator.comparing(Vegetable::getCalories).reversed());
    }

    public ArrayList<Vegetable> getSalad() {
        return salad;
    }

    public void compareTwoVegetables(Vegetable v1, Vegetable v2) {
        if (v1.equals(v2)) {
            System.out.println("Vegetables are equal");
        } else {
            System.out.println("Vegetables are not equal");
        }
    }
}
