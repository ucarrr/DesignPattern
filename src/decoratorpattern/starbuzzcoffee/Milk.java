package decoratorpattern.starbuzzcoffee;

public class Milk  extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.7 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk";
    }
}
