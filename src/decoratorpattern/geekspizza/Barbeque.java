package decoratorpattern.geekspizza;

public class Barbeque extends ToppingsDecorator {
    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 90 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque ";


    }
}
