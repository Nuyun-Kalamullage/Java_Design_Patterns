package SingletonDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package SingletonDesignPattern
 * @project_Name Design patterns
 */
public class TreadSafeMethodPattern {
    //define class object instance in the same class as private static and
    // return the object when get instance method triggered
    // with threadsafe get instance method.

    private static TreadSafeMethodPattern instance;
    private TreadSafeMethodPattern(){

    }
    public static synchronized TreadSafeMethodPattern getInstance(){
        if (instance == null)
            instance = new TreadSafeMethodPattern();
        return instance;
    }
}
