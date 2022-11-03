package factorypattern.pizzastore.simplefactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + pizza.getName() + "\n");

        pizza = chicagoStylePizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + pizza.getName() + "\n");
    }
}
