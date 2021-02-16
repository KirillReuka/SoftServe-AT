package Main;

import java.util.ArrayList;

public class Chief {
    ArrayList<Vegetable> salad = new ArrayList<Vegetable>();

    public void add(String name, String color, double weight, double calories) {
        Vegetable vegetable = new Vegetable(name, color, weight, calories);
        salad.add(vegetable);
    }

    public ArrayList<Vegetable> getSalad() {
        return salad;
    }
}
