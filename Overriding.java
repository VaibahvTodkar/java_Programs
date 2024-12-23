class Vehicle1 {
    public void run(){
        System.out.println("Vehicle is is runing at speed");
    }
}

class Byke extends Vehicle1{
    public void run(){
	super.run();
        System.out.println("Byke is running at speed ");
    }
}

public class Overriding   {
    public static void main(String[] args){
	Byke  b = new Byke();
    	b.run();
    
   }
}
