public class Main {

    public static void main(String[] args) {
        Man oleg = new Man("Oleg", "Ivanov", 178, 75, "Brown");
        Woman elena = new Woman("Elena", "Ivanova", 168, 55, "Red");
        Human child = Human.makeChild("Kate", "Ivanova", 20, 5, "White", null);

        System.out.println(oleg.toString());
        System.out.println("\n");
        System.out.println(elena.toString());
        System.out.println("\n");
        System.out.println(child.toString());
        System.out.println("\n");
        System.out.println("Woman day - " + Woman.womanDay);
    }
}
