package CreationalDesignPatterns.FactoryDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package CreationalDesignPatterns.FactoryDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance(0,4);
        System.out.println(car);
        Vehicle threeWheel = VehicleFactory.getInstance(1,3);
        System.out.println(threeWheel);
    }
}
