public class ThreadDemo4 extends Thread {
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
        ThreadDemo4 t1 = new ThreadDemo4();
        ThreadDemo4 t2 = new ThreadDemo4();
        
        t1.run();
        t2.run();

       
    }
}