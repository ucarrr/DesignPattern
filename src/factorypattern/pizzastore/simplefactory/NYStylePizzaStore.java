package factorypattern.pizzastore.simplefactory;

import factorypattern.pizzastore.simplefactory.NYStylePizzaFranchising.NYStyleCheesePizza;
import factorypattern.pizzastore.simplefactory.NYStylePizzaFranchising.NYStyleClamPizza;
import factorypattern.pizzastore.simplefactory.NYStylePizzaFranchising.NYStylePepperoniPizza;
import factorypattern.pizzastore.simplefactory.NYStylePizzaFranchising.NYStyleVeggiePizza;

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
