package MyPackage;

public class Employee {
    int employeeNo;
    String employeeName;
    public Employee(int employeeNo, String employeeName) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
    }
    
    public void displayEmployeeInformation(){
        System.out.println("Employee Number :"+employeeNo);
        System.out.println("Employee Name :"+employeeName);
    }
}
