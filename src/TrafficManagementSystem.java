import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrafficManagementSystem {
    private List<ITrafficObserver> observers = new ArrayList<>();

    public void addObserver(ITrafficObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ITrafficObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (ITrafficObserver observer : observers) {
            observer.update(message);
        }
    }

    public void simulateTrafficUpdate() {
        Random rand = new Random();
        int congestionLevel = rand.nextInt(10);
        String message = "Traffic congestion level is " + congestionLevel;
        System.out.println("Traffic Management System: " + message);
        notifyObservers(message);
    }
}

