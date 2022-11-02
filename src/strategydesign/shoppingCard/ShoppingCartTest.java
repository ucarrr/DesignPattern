package strategydesign.shoppingCard;


//https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial
public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCard cart = new ShoppingCard();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        //cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        //cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));

        cart.pay(new CashMoney());


    }
}
