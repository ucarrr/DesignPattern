package factorypattern.pizzastore.simplefactory;

import factorypattern.pizzastore.simplefactory.ChicagoStyleCheesePizzaFranchising.ChicagoStyleCheesePizza;
import factorypattern.pizzastore.simplefactory.ChicagoStyleCheesePizzaFranchising.ChicagoStyleClamPizza;
import factorypattern.pizzastore.simplefactory.ChicagoStyleCheesePizzaFranchising.ChicagoStylePepperoniPizza;
import factorypattern.pizzastore.simplefactory.ChicagoStyleCheesePizzaFranchising.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("pepperoni") ){
            pizza = new ChicagoStylePepperoniPizza();
            } else if (type.equals("clam") ){
            pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("veggie") ){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
