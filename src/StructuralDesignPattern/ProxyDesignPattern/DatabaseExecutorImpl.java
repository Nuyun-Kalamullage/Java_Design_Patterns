package StructuralDesignPattern.ProxyDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 01/01/2024
 * @package StructuralDesignPattern.ProxyDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class DatabaseExecutorImpl implements DatabaseExecutor{
    @Override
    public void executeDatabase(String query) throws Exception {
        System.out.println("Going to execute Query: "+ query);
    }
}
