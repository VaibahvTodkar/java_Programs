import java.io.File;

public class DirectoryTest {
   public static void main(String args[]) {
      String dirname = "D://java_Programs//Java File Handling//";
      File directory = new File(dirname);

      // Create directory now.
      directory.mkdirs();

      // create new file object
      File file = new File("D://java_Programs//Java File Handling//");

      System.out.println(file.exists());      
   }
}
