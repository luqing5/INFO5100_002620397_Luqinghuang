package exercises.exercise5;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("latte")) {
            return new Latte();
        }
        return null;
    }
}
