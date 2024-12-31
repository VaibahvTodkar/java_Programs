import MyPackage.Employee;
import MyPackage.Student;
import MyPackage.Cloud.*;

public class MyPackDemo {
    public static void main(String[] args) {

        
        

        // package example 
        Employee e = new Employee(101, "vaibhav");
        e.displayEmployeeInformation();

        Student s = new Student(11, "Ram");
        s.displayStudnetInformation();

        Teacher t = new Teacher(10, "Sham");
        t.displayStudentInformation();
    }
}
