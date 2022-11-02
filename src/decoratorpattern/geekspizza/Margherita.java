package decoratorpattern.geekspizza;

// Concrete pizza classes
public class Margherita extends Pizza{
    public Margherita() {
        description="Margherita";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
