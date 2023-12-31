package CreationalDesignPatterns.SingletonDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package CreationalDesignPatterns.SingletonDesignPattern
 * @project_Name Design patterns
 */
public class EagerPattern {
    //define & initialize class object instance in the same class as private static and
    //return the object when get instance method triggered.
    private static final EagerPattern instance = new EagerPattern();
    private EagerPattern() {
    }
    public static EagerPattern getInstance(){
        return instance;
    }
}
