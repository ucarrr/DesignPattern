package strategydesign.StreetFighter;

// Characters
public class ChunLi extends Fighter{
    public ChunLi(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("ChunLi");

    }
}
