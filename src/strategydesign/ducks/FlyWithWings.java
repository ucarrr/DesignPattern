package strategydesign.ducks;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I' am Flying! ");
    }
}
