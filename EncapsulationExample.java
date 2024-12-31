class EmployeeInfo{
    private int employeeId;
    private String employeeName;
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
}


public class EncapsulationExample {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo();
        e.setEmployeeId(10);
        e.setEmployeeName("Vikas");

        System.out.println(e.getEmployeeId());
        System.out.println(e.getEmployeeName());
    }

}
