package FactoryDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package FactoryDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class ThreeWheel extends Vehicle{
    int wheel;

    public ThreeWheel(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheels() {
        return this.wheel;
    }
}
