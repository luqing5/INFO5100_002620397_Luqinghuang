package exercises.exercise5;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        CoffeeShop myCoffeeShop = CoffeeShop.getInstance();

        // Factory Pattern
        Coffee espresso = CoffeeFactory.createCoffee("espresso");
        espresso.brew();

        Coffee latte = CoffeeFactory.createCoffee("latte");
        latte.brew();

        // Observer Pattern
        Order order = new Order();
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        order.addObserver(customer1);
        order.addObserver(customer2);

        order.setStatus("Preparing");

        // Simulating multiple orders
        myCoffeeShop.takeOrder("Alice", "Espresso");
        myCoffeeShop.takeOrder("Bob", "Latte");
        myCoffeeShop.takeOrder("Charlie", "Espresso");
        myCoffeeShop.takeOrder("Dave", "Cappuccino"); // Not available
    }
    }



