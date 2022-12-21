package factorypattern.pizzastore.abstractfactorypattern;

public class VeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {

    }
}
