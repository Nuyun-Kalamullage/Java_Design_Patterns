package CreationalDesignPatterns.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nuyun-Kalamullage
 * @IDE IntelliJ IDEA
 * @date 31/12/2023
 * @package CreationalDesignPatterns.PrototypeDesignPattern
 * @project_Name Java_Design_Patterns
 */
public class StudentDAO implements Cloneable {
    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(10);
        student1.setName("PK");
        Student student2 = new Student();
        student2.setId(20);
        student2.setName("MK");
        studentList.add(student1);
        studentList.add(student2);
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public List<Student> clone() throws CloneNotSupportedException {
        List<Student> dummyStudentList = new ArrayList<>();
        for (Student student : studentList) {
            dummyStudentList.add(student);
        }
        return dummyStudentList;
    }
}
