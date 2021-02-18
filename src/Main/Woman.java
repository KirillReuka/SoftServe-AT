package Main;

public class Woman extends Human {

    private final String nailsColor;

    public Woman(String name, String surname, int height, int weight, String nailsColor) {
        super(name, surname, height, weight);
        this.nailsColor = nailsColor;
    }

    public String getNailsColor() {
        return nailsColor;
    }

    public void display() {
        super.display();
        System.out.println("Nails color - " + getNailsColor());
    }
}
