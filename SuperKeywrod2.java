class Person {
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

}

class Employee extends Person{
    int salary;
    Employee(int id, String name, int salary){
        super(id, name);
        this.salary = salary;
    }
    public void display(){
        System.out.println("Person id :"+id);
        System.out.println("Person Name :"+name);
        System.out.println("Person Salary :"+salary);
    }
}

public class SuperKeywrod2 {
    public static void main(String[] args) {
        Employee e = new Employee(10, "Vaibhav", 100000);
        Employee e2 = new Employee(11, "Ran", 200000);
        e.display();
        e2.display();
    }
}
