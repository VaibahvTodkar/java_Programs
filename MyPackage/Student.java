package MyPackage;

public class Student {
    int studentNo;
    String studentName;

    public Student(int studentNo, String studentName) {
        this.studentNo = studentNo;
        this.studentName = studentName;
    }

    public void displayStudnetInformation(){
        System.out.println("Student Number :"+studentNo);
        System.out.println("Student Name :"+studentName);
    }
    
}
