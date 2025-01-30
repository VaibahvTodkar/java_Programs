import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("D://java_Programs//Java File Handling//Sample.txt");
            int j = is.available();

            for(int k = 0; k < j; k++){
                System.out.println((int)(is.read()));
            }
            is.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
