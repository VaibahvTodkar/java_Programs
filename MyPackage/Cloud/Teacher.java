 package MyPackage.Cloud;

public class Teacher {
    int teacherNo;
    String teacherName;
    

    public Teacher(int teacherNo, String teacherName) {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
    }


    public void displayStudentInformation(){
        System.out.println("Teacher Number :"+teacherNo);
        System.out.println("Teacher Name :"+teacherName );
    }

    
    
}
