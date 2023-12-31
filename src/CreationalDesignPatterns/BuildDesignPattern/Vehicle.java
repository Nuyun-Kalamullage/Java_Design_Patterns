package CreationalDesignPatterns.BuildDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 28/08/2023
 * @package BuilderDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class Vehicle {
    //Required Parameter
    private String engine;
    private int wheel;

    //Optional Parameter
    private int seats;
    private int airBags;

    private Vehicle(VehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.seats = builder.seats;
        this.airBags = builder.airBags;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getSeats() {
        return seats;
    }

    public int getAirBags() {
        return airBags;
    }

    public void printVehicle(){
        System.out.println("Engine : "+getEngine());
        System.out.println("Wheels : "+getWheel());
        System.out.println("Seats : "+getSeats());
        System.out.println("Air Bags : "+getAirBags());
    }
    public static class VehicleBuilder {

        //Required Parameter
        private String engine;
        private int wheel;

        //Optional Parameter
        private int seats;
        private int airBags;

        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public VehicleBuilder setAirBags(int airBags) {
            this.airBags = airBags;
            return this;
        }
        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
