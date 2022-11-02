package decoratorpattern.geekspizza;

// Concrete pizza classes
public class FarmHouse extends Pizza{
    public FarmHouse() {
        description="FarmHouse";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
