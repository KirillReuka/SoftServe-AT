package Main;

public class Man extends Human {

    private final String beardColor;

    public Man(String name, String surname, int height, int weight, String  beardColor) {
        super(name, surname, height, weight);
        this.beardColor = beardColor;
    }

    public String getBeardColor() {
        return beardColor;
    }

    public void display() {
        super.display();
        System.out.println("Beard color - " + getBeardColor());
    }
}
