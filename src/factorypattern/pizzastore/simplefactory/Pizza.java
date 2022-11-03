package factorypattern.pizzastore.simplefactory;

import java.util.ArrayList;

public abstract class Pizza {
    Pizza pizza;

    public String name;
    public String dough;
    public String sauce;
    public ArrayList toppings = new ArrayList();


    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slice");
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public String getName() {
        return name;
    }
}
