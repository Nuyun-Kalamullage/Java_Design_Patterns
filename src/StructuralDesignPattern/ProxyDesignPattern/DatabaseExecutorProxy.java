package StructuralDesignPattern.ProxyDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 01/01/2024
 * @package StructuralDesignPattern.ProxyDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class DatabaseExecutorProxy implements DatabaseExecutor{
    private boolean ifAdmin;
    private DatabaseExecutorImpl dbExecutor;

    public DatabaseExecutorProxy(String name, String password) {
        if (name == "Admin" && password.equals("Admin@123")){
            this.ifAdmin = true;
            this.dbExecutor = new DatabaseExecutorImpl();
        }
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if (ifAdmin){
            dbExecutor.executeDatabase(query);
        }else {
            if (query.equals("DELETE")){
                throw new Exception("DELETE not allowed for non-admin user");
            }else{
                dbExecutor.executeDatabase(query);
            }
        }
    }
}
