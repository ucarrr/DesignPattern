package factorypattern.pizzastore.factorymethodpattern;

import factorypattern.pizzastore.factorymethodpattern.PizzaIngredientType.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
