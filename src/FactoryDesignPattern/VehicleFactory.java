package FactoryDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package FactoryDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class VehicleFactory {
    public static Vehicle getInstance(int Type, int wheels){
        if (Type == 0){
            return new Car(wheels);
        }else if (Type == 1){
            return new ThreeWheel(wheels);
        }
        return null;
    }
}
