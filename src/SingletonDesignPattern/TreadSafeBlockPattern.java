package SingletonDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package SingletonDesignPattern
 * @project_Name Design patterns
 */
public class TreadSafeBlockPattern {
    private static TreadSafeBlockPattern instance;
    private TreadSafeBlockPattern(){

    }
    public static TreadSafeBlockPattern getInstance(){
        if (instance == null){
            synchronized (TreadSafeBlockPattern.class){
                if (instance == null)
                    instance = new TreadSafeBlockPattern();
            }
        }
        return instance;
    }
}
