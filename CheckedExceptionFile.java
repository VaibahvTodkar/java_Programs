import java.io.File;
import java.io.FileReader;

public class CheckedExceptionFile {
    
    public static void main(String[] args) {
        try {
            File f1 = new File("Sample.txt");
        FileReader fr = new FileReader(f1);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
