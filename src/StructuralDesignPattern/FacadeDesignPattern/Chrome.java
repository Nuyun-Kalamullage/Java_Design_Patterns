package StructuralDesignPattern.FacadeDesignPattern;

import java.sql.Driver;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 01/01/2024
 * @package StructuralDesignPattern.FacadeDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class Chrome {
    public static Driver getChromeDriver(){
        return null;
    }
    public static void generateHTMLReport(String test, Driver driver){
        System.out.println("Generating HTML Report for Chrome Driver");
    }
    public static void generateJUnitReport(String test, Driver driver){
        System.out.println("Generating JUNIT Report for Chrome Driver");
    }
}
