package decoratorpattern.geekspizza;

// Concrete pizza classes
public class PeppyPaneer extends Pizza{

    public PeppyPaneer() {
        description="PeppyPaneer";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
