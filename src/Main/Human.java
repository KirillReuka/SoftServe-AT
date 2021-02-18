package Main;

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

    public void display() {
        System.out.println("Name - " + getName());
        System.out.println("Surname - " + getSurname());
        System.out.println("Height - " + getHeight());
        System.out.println("Weight - " + getWeight());
    }
}

