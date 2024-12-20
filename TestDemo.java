// This Keyword implementation

// this keyword -> current class variavles 
// this Constructor -> current class constructor
// super keyword -> parent class variavles 
// super Constructor -> parent class constructor
class Student{
    int id;
    String name;
    String dept;

    Student(int id, String name, String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.display();
    }
    public void display(){
        System.out.println("Id :"+id+"\nName :"+name+"\nDept :"+dept);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student s = new Student(101, "Vaibhav", "Information Technology");
        Student s1 = new Student(102, "Ram", "CSE");
        // s.display();
        // s1.display();
    }
}
