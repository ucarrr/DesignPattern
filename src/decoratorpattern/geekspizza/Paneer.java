package decoratorpattern.geekspizza;

public class Paneer extends ToppingsDecorator {
    Pizza pizza;


    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 70 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer ";
    }
}
