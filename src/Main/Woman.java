public class Woman extends Human {

    private final String nailsColor;
    public static final String womanDay = "08.03";

    public Woman(String name, String surname, int height, int weight, String nailsColor) {
        super(name, surname, height, weight);
        this.nailsColor = nailsColor;
    }

    public String getNailsColor() {
        return nailsColor;
    }

    public String getWomanDay() { return womanDay; }

    @Override
    public String toString() {
        return "Name - " + getName() + "\n" +
                "Surname - " + getSurname() + "\n" +
                "Height - " + getHeight() + "\n" +
                "Weight - " + getWeight() + "\n" +
                "Nails color - " + getNailsColor();
    }
}
