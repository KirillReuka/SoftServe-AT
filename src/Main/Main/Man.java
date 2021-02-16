package Main;

public class Man extends Human {
    private String beardColor;

    public Man(String name, String surname, int height, int weight, String  beardColor) {
        super(name, surname, height, weight);
        this.beardColor = beardColor;
    }

    public String getBeardColor() {
        return beardColor;
    }

    public void setBeardColor(String beardColor) {
        this.beardColor = beardColor;
    }

    public void displayManInfo() {
        System.out.println("Name - " + getName());
        System.out.println("Surname - " + getSurname());
        System.out.println("Height - " + getHeight());
        System.out.println("Weight - " + getWeight());
        System.out.println("Beard color - " + getBeardColor());
    }
}
