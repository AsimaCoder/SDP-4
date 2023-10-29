public class VehicleFactory {
    public Vehicle createVehicle(String type, String name) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car(name);
        } else if ("Bus".equalsIgnoreCase(type)) {
            return new Bus(name);
        } else {
            throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

