public class ThreadDemo2  {
    
    public static void main(String[] args) {
        Thread t1 = new Thread("VaibhavThred");
        t1.start();
        String st =  t1.getName();
        System.out.println(st);

    }
}
