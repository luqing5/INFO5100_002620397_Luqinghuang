package exercises.exercise5;

class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ", Order Status: " + message);
    }
}
