// we can create thread by using Thread class and using Runable interface 

public class ThreadDemo implements Runnable {    
   public void run(){
    System.out.println("This is my new thread");
   }
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        Thread t2 = new Thread(t);
        t2.start();
    }
}
