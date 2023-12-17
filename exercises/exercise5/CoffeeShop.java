
package exercises.exercise5;
//Singleton pattern implementation
import java.util.HashMap;
import java.util.Map;

public class CoffeeShop {
    private static CoffeeShop instance;
    private Map<String, Integer> menu;

    private CoffeeShop() {
        menu = new HashMap<>();
        // Initializing menu items
        menu.put("espresso", 5);
        menu.put("latte", 7);
    }

    public static synchronized CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void takeOrder(String customer, String coffeeType) {
        if (menu.containsKey(coffeeType.toLowerCase()) && menu.get(coffeeType.toLowerCase()) > 0) {
            System.out.println("Order taken from " + customer + " for " + coffeeType);
            decrementCoffee(coffeeType.toLowerCase());
            // Logic for processing the order
        } else {
            System.out.println("Sorry, " + coffeeType + " is not available.");
        }
    }

    private void decrementCoffee(String coffeeType) {
        int count = menu.get(coffeeType);
        if(count>0){
        menu.put(coffeeType, count - 1);
    }
}
}
