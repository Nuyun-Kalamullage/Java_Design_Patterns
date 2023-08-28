package FactoryDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package FactoryDesignPattern
 * @project_Name Java_Design_Patterns
 */
public abstract class Vehicle {
    public abstract int getWheels();

    @Override
    public String toString() {
        return "Wheels of the vehicle is " + String.format("%02d", this.getWheels());
    }
}
