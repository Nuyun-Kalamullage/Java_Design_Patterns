package CreationalDesignPatterns.SingletonDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 27/08/2023
 * @package CreationalDesignPatterns.SingletonDesignPattern
 * @project_Name Design patterns
 */
public class Main {
    public static void main(String[] args) {
        //initializing using Singleton eager-design pattern.
        EagerPattern eagerPattern1 = EagerPattern.getInstance();
        EagerPattern eagerPattern2 = EagerPattern.getInstance();
        System.out.println("\nSingleton Eager 01 Object : "+eagerPattern1+"\nSingleton Eager 02 Object : "+eagerPattern2);

        //initializing using Singleton lazy-design pattern.
        LazyPattern lazyPattern1 = LazyPattern.getInstance();
        LazyPattern lazyPattern2 = LazyPattern.getInstance();
        System.out.println("\nSingleton Lazy 01 Object : "+lazyPattern1+"\nSingleton Lazy 02 Object : "+lazyPattern2);

        //initializing using Singleton Thread safe Method Initialisation design pattern.
        TreadSafeMethodPattern treadSafeMethodPattern1 = TreadSafeMethodPattern.getInstance();
        TreadSafeMethodPattern treadSafeMethodPattern2 = TreadSafeMethodPattern.getInstance();
        System.out.println("\nSingleton Tread-Safe Method Pattern 01 Object : "+treadSafeMethodPattern1+
                "\nSingleton Tread-Safe Method Pattern 02 Object : "+treadSafeMethodPattern2);

        //initializing using Singleton Thread safe Block Initialisation design pattern.
        TreadSafeBlockPattern treadSafeBlockPattern1 = TreadSafeBlockPattern.getInstance();
        TreadSafeBlockPattern treadSafeBlockPattern2 = TreadSafeBlockPattern.getInstance();
        System.out.println("\nSingleton Tread-Safe Block Pattern 01 Object : "+treadSafeBlockPattern1+
                "\nSingleton Tread-Safe Block Pattern 02 Object : "+treadSafeBlockPattern2);
    }
}
