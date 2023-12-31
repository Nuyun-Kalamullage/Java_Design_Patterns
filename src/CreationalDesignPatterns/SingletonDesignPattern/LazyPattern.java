package CreationalDesignPatterns.SingletonDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package CreationalDesignPatterns.SingletonDesignPattern
 * @project_Name Design patterns
 */
public class LazyPattern {
    //define class object instance in the same class as private static and
    // return the object when get instance method triggered.
    private static LazyPattern instance;
    private LazyPattern(){
    }
    public static LazyPattern getInstance(){
        if (instance == null)
            instance = new LazyPattern();
        return instance;
    }
}
