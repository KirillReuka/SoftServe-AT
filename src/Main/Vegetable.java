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
