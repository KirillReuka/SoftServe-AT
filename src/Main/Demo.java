public class Demo {
    public static void main(String[] args) {
        Chief chief = new Chief();

        chief.addVegetableToSalad("Tomato", "Red", 100, 24);
        chief.addVegetableToSalad("Cucumber", "Green", 200, 15);
        chief.addVegetableToSalad("Onion", "White", 100, 47);
        chief.addVegetableToSalad("Potato", "Yellow", 400, 479);
        chief.addVegetableToSalad("Carrot", "Orange", 50, 23);
        chief.addVegetableToSalad("Beet", "Pink", 300, 78);

        System.out.println("Vegetables added");
        chief.showSalad();
        System.out.println("Salad consists of " + chief.getCalories() + " calories.");
        System.out.println();

        System.out.println("Delete Tomato by name");
        System.out.println();
        chief.deleteByName("Tomato");
        chief.showSalad();
        System.out.println("Salad consists of " + chief.getCalories() + " calories.");

        System.out.println("Delete all vegetables");
        chief.deleteAllVegetables();
        chief.showSalad();
        System.out.println();

        System.out.println("Vegetables added");
        chief.addVegetableToSalad("Tomato", "Red", 150, 24);
        chief.addVegetableToSalad("Cucumber", "Green", 220, 15);
        chief.addVegetableToSalad("Onion", "White", 100, 47);
        chief.addVegetableToSalad("Potato", "Yellow", 400, 479);
        chief.addVegetableToSalad("Carrot", "Orange", 50, 23);
        chief.addVegetableToSalad("Beet", "Pink", 300, 78);
        chief.showSalad();

        System.out.println("Delete Potato by color yellow");
        chief.deleteByColor("Yellow");
        chief.showSalad();
        System.out.println();
        System.out.println("Salad consists of " + chief.getCalories() + " calories.");
        System.out.println();

        System.out.println("Delete Beet by weight from 250 to 350 g");
        chief.deleteByWeight(250, 350);
        chief.showSalad();
        System.out.println();

        System.out.println("Sorted by weight");
        chief.sortingByWeight();
        chief.showSalad();
        System.out.println();

        System.out.println("Sorted by calories");
        chief.sortingByCalories();
        chief.showSalad();
        System.out.println();

        chief.deleteAllVegetables();
        chief.addVegetableToSalad("Beet", "Pink", 300, 78);
        chief.addVegetableToSalad("Beet", "Pink", 300, 78);
        System.out.println("Compare vegetables");
        chief.compareTwoVegetables(chief.salad.get(0), chief.salad.get(1));
    }
}