public class DemonDemoThread extends Thread {
    public void run(){
        if (Thread.currentThread().isDaemon()) {
            System.out.println( "Demon Thread");  
        }
        else
        {
            System.out.println("user thread");
        }
    }
    public static void main(String[] args) {
        DemonDemoThread dd = new DemonDemoThread();
        DemonDemoThread dd2 = new DemonDemoThread();
        DemonDemoThread dd3 = new DemonDemoThread();
        dd.setDaemon(true);
        dd.start();
        dd2.start();
        dd3.start();

        
    }
}
