package Main;

public class Main {

    public static void main(String[] args) {
        Man oleg = new Man("Oleg", "Ivanov", 178, 75, "Brown");
        Woman elena = new Woman("Elena", "Ivanova", 168, 55, "Red");
        oleg.display();
        System.out.println("\n");
        elena.display();
    }
}
