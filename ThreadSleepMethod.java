public class ThreadSleepMethod extends Thread {
    public static void main(String[] args) {
        try {
            for(int i=0; i < 5; i ++){
                Thread.sleep(-100);
                System.out.println(i);
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
