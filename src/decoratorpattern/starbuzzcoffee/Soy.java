package decoratorpattern.starbuzzcoffee;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.99 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy";
    }
}
