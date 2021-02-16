public class Vegetable {
    private String name;
    private String color;
    private int weight;
    private int calories;

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
