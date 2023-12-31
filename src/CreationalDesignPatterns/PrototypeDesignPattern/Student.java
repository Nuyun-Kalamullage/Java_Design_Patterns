package CreationalDesignPatterns.PrototypeDesignPattern;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 31/12/2023
 * @package CreationalDesignPatterns.PrototypeDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class Student {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id = "+id+", name = "+name+ "]";
    }
}
