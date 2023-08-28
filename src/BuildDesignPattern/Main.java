package BuilderDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 28/08/2023
 * @package BuilderDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle
                .VehicleBuilder("2000",4)
                .setAirBags(2)
                .setSeats(4)
                .build();

        Vehicle van = new Vehicle.VehicleBuilder("2500",4)
                .setSeats(16)
                .build();

        car.printVehicle();
        System.out.println();
        van.printVehicle();
    }
}
