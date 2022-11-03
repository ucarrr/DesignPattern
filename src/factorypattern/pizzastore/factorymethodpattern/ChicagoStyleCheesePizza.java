package factorypattern.pizzastore.factorymethodpattern;



public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
