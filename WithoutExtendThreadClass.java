public class WithoutExtendThreadClass implements Runnable {
    public void run(){
        System.out.println("THis is thread run method");
    }

    public static void main(String[] args) {
        WithoutExtendThreadClass wt = new WithoutExtendThreadClass();
        Thread t = new Thread(wt, "VaibhavThread");
       
        t.start();

        String s = t.getName();
        System.out.println(s);
    }
}
