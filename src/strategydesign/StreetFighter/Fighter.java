package strategydesign.StreetFighter;

public abstract class Fighter {

    KickBehavior kickBehavior;
    JumpBehavior jumpBehavior;

    public Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        this.kickBehavior = kickBehavior;
        this.jumpBehavior = jumpBehavior;
    }

    public void punch()
    {
        System.out.println("Default Punch");
    }
    public void kick(){
        // delegate to kick behavior
        kickBehavior.kick();
    }
    public void jump(){
        // delegate to jump behavior
        jumpBehavior.jump();
    }
    public void roll()
    {
        System.out.println("Default Roll");
    }
    public void setJumpBehavior(JumpBehavior jb){
        jumpBehavior=jb;
    }
    public void setKickBehavior(KickBehavior kb){
        kickBehavior=kb;
    }

    public abstract void display();

}
