package Main;

public class Vegetable {
    private String name;
    private String color;
    private double weight;
    private double calories;

    public Vegetable(String name, String color, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.color = color;
    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    double getWeight() {
        return weight;
    }

    double getCalories() {
        return calories;
    }
}
