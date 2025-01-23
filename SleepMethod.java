public class SleepMethod extends Thread{
    public void run(){
        int i;
        for(i = 1 ; i <  5; i++){
            try {
                sleep(10000);
                
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SleepMethod t1 = new SleepMethod();
        SleepMethod t2 = new SleepMethod();
   
        t1.start();;
        t2.start();
    }
}
