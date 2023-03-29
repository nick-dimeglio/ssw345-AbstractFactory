public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza2 = chicagoPizzaStore.orderPizza("veggie");
        System.out.println(pizza2);
    }
}

