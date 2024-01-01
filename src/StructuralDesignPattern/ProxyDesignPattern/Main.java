package StructuralDesignPattern.ProxyDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 01/01/2024
 * @package StructuralDesignPattern.ProxyDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class Main {
    public static void main(String[] args) throws Exception{
//        DatabaseExecutor nonAdminExecutor = new DatabaseExecutorProxy("NonAdmin", "Admin@123");
//        nonAdminExecutor.executeDatabase("DELETE");
        DatabaseExecutor adminExecutor = new DatabaseExecutorProxy("Admin", "Admin@123");
        adminExecutor.executeDatabase("DELETE");
    }
}
