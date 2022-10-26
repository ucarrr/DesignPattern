package strategydesign.shoppingCard;

public class CashMoney implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Cash.");
    }
}
