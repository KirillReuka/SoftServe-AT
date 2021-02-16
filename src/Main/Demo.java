public class Demo {
    public static void main(String[] args) {
        Chief chief = new Chief();

        chief.add("Tomato", "Red", 100, 24);
        chief.add("Cucumber", "Green", 100, 15);
        chief.add("Onion", "White", 100, 47);

        chief.showSalad();
        System.out.println("Salad consists of " + chief.getCalories() + " calories.");
        System.out.println();

        chief.showSalad();
        chief.deleteByName("Tomato");
        chief.showSalad();
        System.out.println();

        chief.deleteAllVegetables();
        chief.showSalad();
        System.out.println();
        chief.add("Tomato", "Red", 1, 24);
        chief.add("Cucumber", "Green", 10, 15);
        chief.add("Onion", "White", 1, 47);

        chief.deleteByColor("Red");
        chief.showSalad();
        System.out.println("Salad consists of " + chief.getCalories() + " calories.");

        chief.deleteByWeight(400, 1000);
        chief.showSalad();

        chief.sortingByWeight();
        chief.showSalad();
        System.out.println();

        chief.sortingByCalories();
        chief.showSalad();

        chief.compareTwoVegetables(chief.getSalad().get(0), chief.getSalad().get(1));

    }
}