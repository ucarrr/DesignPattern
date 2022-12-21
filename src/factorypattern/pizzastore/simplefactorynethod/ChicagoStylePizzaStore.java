package factorypattern.pizzastore.simplefactorynethod;

import factorypattern.pizzastore.simplefactorynethod.ChicagoStyleCheesePizzaFranchising.ChicagoStyleCheesePizza;
import factorypattern.pizzastore.simplefactorynethod.ChicagoStyleCheesePizzaFranchising.ChicagoStyleClamPizza;
import factorypattern.pizzastore.simplefactorynethod.ChicagoStyleCheesePizzaFranchising.ChicagoStylePepperoniPizza;
import factorypattern.pizzastore.simplefactorynethod.ChicagoStyleCheesePizzaFranchising.ChicagoStyleVeggiePizza;

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
