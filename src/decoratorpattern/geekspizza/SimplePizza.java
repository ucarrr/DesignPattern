package decoratorpattern.geekspizza;

// Concrete pizza classes
public class SimplePizza extends Pizza {

    public SimplePizza() {
        description="SimplePizza";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
