public class Vehicle implements ITrafficObserver {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " is checking the traffic update...");
        System.out.println(name + " received the following message: " + message);
        if (message.contains("congestion level is 8")) {
            System.out.println(name + " decides to take a different route.");
        } else {
            System.out.println(name + " continues on the current route.");
        }
        System.out.println();
    }
}




