package Main;

public class Woman extends Human {
    private String nailsColor;

    public Woman(String name, String surname, int height, int weight, String nailsColor) {
        super(name, surname, height, weight);
        this.nailsColor = nailsColor;
    }

    public String getNailsColor() {
        return nailsColor;
    }

    public void setNailsColor(String nailsColor) {
        this.nailsColor = nailsColor;
    }

    public void displayWomanInfo() {
        System.out.println("Name - " + getName());
        System.out.println("Surname - " + getSurname());
        System.out.println("Height - " + getHeight());
        System.out.println("Weight - " + getWeight());
        System.out.println("Nails color - " + getNailsColor());
    }
}
