public class Main {
    public static void main(String[] args) {
        TrafficManagementSystem trafficSystem = new TrafficManagementSystem();
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car1 = vehicleFactory.createVehicle("Car", "Car 2");
        Vehicle bus1 = vehicleFactory.createVehicle("Bus", "Bus 12");

        trafficSystem.addObserver(car1);
        trafficSystem.addObserver(bus1);

        trafficSystem.simulateTrafficUpdate();
    }
}
