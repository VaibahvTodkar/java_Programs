import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        byte btarr[] = { 65,66,67,68,69 };
        
        try {
            FileOutputStream ob = new FileOutputStream("D://java_Programs//Java File Handling//Sample.txt");
            
            for (int i = 0; i < btarr.length; i++) {
                ob.write(btarr[i]);
            }

            ob.close();

            
           
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}