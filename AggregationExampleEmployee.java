public class AggregationExampleEmployee {
    int emp_id;
    String name;
    Address address;
    public AggregationExampleEmployee(int emp_id, String name, Address address){
        this.emp_id = emp_id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Employee ID :"+emp_id);
        System.out.println("Employee Name :"+name);
        System.out.println("Address: \nCity :"+address.city+"\nState :"+address.state+"\nCountry :"+address.country+"\nZip-Code :"+address.zipcode);
    }
    public static void main(String[] args) {
        Address a = new Address("Pune", "Maharashstra","India",416436);
        Address a1 = new Address("Malkapur", "Maharashstra","India",443101);
        AggregationExampleEmployee e = new AggregationExampleEmployee(101, "Vaibhav", a);
        AggregationExampleEmployee e1 = new AggregationExampleEmployee(102, "Navin", a1);
        e.display();
        e1.display();
    }
}
