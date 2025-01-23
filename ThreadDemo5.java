public class ThreadDemo5 extends Thread {
   public void run(){
    try{
        for(int i = 0; i < 5; i++){
            sleep(1000);
            System.out.println(i);
        }
    }catch(Exception e){
        System.out.println(e);
    }
   }

   public static void main(String[] args) {
    ThreadDemo5 t1 = new ThreadDemo5();
    ThreadDemo5 t2 = new ThreadDemo5();
    ThreadDemo5 t3 = new ThreadDemo5();

    t1.start();
    try {
        System.out.println(t1.getName());
        t1.join();
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
    t2.start();
  

   

    try {
        System.out.println(t2.getName());
        t2.join();
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }

    t3.start();
    try {
        System.out.println(t3.getName());
        t3.join();
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
   }

}
