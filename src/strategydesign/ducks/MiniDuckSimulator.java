package strategydesign.ducks;

public class MiniDuckSimulator {
    public static void main(String[] args) {
       Duck mallardDuck= new MallardDuck();
       mallardDuck.display();
       mallardDuck.performQuack();
       mallardDuck.performFly();


       Duck modelDuck=new ModelDuck();

       modelDuck.display();
       modelDuck.performFly();
       modelDuck.performQuack();

       modelDuck.setFlyBehavior(new FlyRocketPowered());
       modelDuck.performFly();


    }
}
