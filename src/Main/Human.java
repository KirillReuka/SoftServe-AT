abstract public class Human {

    private final String name;
    private final String surname;
    private final double height;
    private final double weight;

    public Human(String name, String surname, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public static Human makeChild(String name, String surname, int height, int weight, String nailsColor, String beardColor) {
        if ((Math.random() + 1) == 1) {
            return new Man(name, surname, height, weight, beardColor);
        } else {
            return new Woman(name, surname, height, weight, nailsColor);
        }
    }
}

