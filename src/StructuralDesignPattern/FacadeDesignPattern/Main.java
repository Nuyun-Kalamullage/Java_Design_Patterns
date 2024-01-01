package StructuralDesignPattern.FacadeDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 01/01/2024
 * @package StructuralDesignPattern.FacadeDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class Main  {
    public static void main(String[] args) {
        String test = "CheckElementPresent";
        WebExploreHelperFacade.generateReports("firefox", "html", test);
        WebExploreHelperFacade.generateReports("firefox", "junit", test);
        WebExploreHelperFacade.generateReports("chrome", "html", test);
        WebExploreHelperFacade.generateReports("chrome", "junit", test);
    }
}
