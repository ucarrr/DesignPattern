package factorypattern.pizzastore.simplefactorynethod;

import factorypattern.pizzastore.simplefactorynethod.NYStylePizzaFranchising.NYStyleCheesePizza;
import factorypattern.pizzastore.simplefactorynethod.NYStylePizzaFranchising.NYStyleClamPizza;
import factorypattern.pizzastore.simplefactorynethod.NYStylePizzaFranchising.NYStylePepperoniPizza;
import factorypattern.pizzastore.simplefactorynethod.NYStylePizzaFranchising.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
