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
        chief.add("Tomato", "Red", 100, 24);
        chief.add("Cucumber", "Green", 100, 15);
        chief.add("Onion", "White", 100, 47);

        chief.deleteByColor("Red");
        chief.showSalad();
        System.out.println("Salad consists of " + chief.getCalories() + " calories.");
    }
}

//DONE
//добавлять овощи в салат
//отображать в консоль список овощей из которых состоит салат
//подсчитывать калории салата
//убирать овощи из салата
//Если салат пустой - выводить что он пустой

//TO DO
//сортировать овощи в салате по калориям и по весу
//искать овощи по признакам (по цвету, по весовому диапазону)
//иметь возможность сравнить два овоща (равны ли они между собой).
//hashCode()
// Equals()
