import java.util.Objects;
public class Vegetable {
    private final String name;
    private final String color;
    private final int weight;
    private final int calories;

    public Vegetable(String name, String color, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.color = color;
    }

    @Override
    public String toString() {
        return getName() + ", " + getWeight() + " g, " + getCalories() + " calories.";
    }

    public boolean equals(Vegetable v) {
        if((this.getWeight() == v.getWeight()) && this.getName() == v.getName() && this.getColor() == v.getColor())  {
            return true;
        } else {
            return false;
        }
    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    int getWeight() {
        return weight;
    }

    int getCalories() {
        return calories;
    }
}
