package decoratorpattern.geekspizza;

public class PizzaStore {
    public static void main(String[] args) {
        // create new margherita pizza
        Pizza margherita = new Margherita();
        System.out.println(margherita.getDescription() + " Cost :" + margherita.getCost());


        // create new FarmHouse pizza
        Pizza farmHouse = new FarmHouse();

        // decorate it with freshtomato topping
        farmHouse = new FreshTomato(farmHouse);

        //decorate it with paneer topping
        farmHouse = new Paneer(farmHouse);

        System.out.println(farmHouse.getDescription() + " Cost :" + farmHouse.getCost());


        //Pizza barbeque = new Barbeque(null); //no specific pizza

        //System.out.println(barbeque.getDescription() + "  Cost :" + barbeque.getCost());

    }
}
