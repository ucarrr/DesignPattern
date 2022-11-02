package decoratorpattern.geekspizza;

// Concrete pizza classes
public class ChickenFiesta extends Pizza {

    public ChickenFiesta() {
        description="ChickenFiesta";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
