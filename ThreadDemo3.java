public class ThreadDemo3 extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadDemo3 t1 = new ThreadDemo3();
        t1.start();
        t1.start();

        // we can not start the thread again in his life cycle,
    }
}
