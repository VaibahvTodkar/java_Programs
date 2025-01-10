import java.io.File;
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {

        // File fileobj = new File("C:\\Users\\todka\\OneDrive\\Documents\\Movie Recommendations\\data.csv");

        // StringTokenizer st = new StringTokenizer(fileobj, ",");
        int count = 0;
        StringTokenizer t = new StringTokenizer("Hello ; this ; is ; the ; string ; Tokenizer", ";", true);
        while(t.hasMoreTokens()){
            count++;
            System.out.println(t.nextToken());
            

            
        }    
        System.out.println(count);

            // StringTokenizer t = new StringTokenizer("Hello this is the string Tokenizer");
            // while(t.hasMoreTokens()){
            //     System.out.println(t.nextToken());
                
                
            // }
            // System.out.println(t.countTokens());

           
    }
    
}