public class Man extends Human {

    private final String beardColor;

    public Man(String name, String surname, int height, int weight, String  beardColor) {
        super(name, surname, height, weight);
        this.beardColor = beardColor;
    }

    public String getBeardColor() {
        return beardColor;
    }

    @Override
    public String toString() {
        return "Name - " + getName() + "\n" +
                "Surname - " + getSurname() + "\n" +
                "Height - " + getHeight() + "\n" +
                "Weight - " + getWeight() + "\n" +
                "Beard color - " + getBeardColor();
    }
}
