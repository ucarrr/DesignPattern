package strategydesign.StreetFighter;

public class StreetFighter {
    public static void main(String[] args) {

        JumpBehavior shortJump=new ShortJump();
        JumpBehavior longJump = new LongJump();

        KickBehavior tornadoKick = new TornadoKick();
        KickBehavior lightningKick=new LightningKick();



        Fighter ken = new Ken(tornadoKick,shortJump);
        ken.display();


        // Test behaviors
        ken.punch();
        ken.kick();
        ken.jump();


        // Change behavior dynamically (algorithms are
        // interchangeable)

        System.out.println("\nChange behavior");
        ken.setJumpBehavior(new LongJump());
        ken.jump();

        System.out.println(" ");
        Fighter chunLi=new ChunLi(lightningKick,longJump);
        chunLi.display();
        chunLi.kick();
        chunLi.jump();
        chunLi.punch();
    }
}
