class Animal{
    public void eat(){
        System.out.println("Animal eat method executed");
    }
}

class Tiger extends Animal {
    public void eat(){
        System.out.println("Eat Method of tiger class");
    }
    public void rore(){
        System.out.println("Tiger ROARRRRRRRRRRRRR!");
    }
}

class Cub extends Tiger{
    public void weaps(){
        System.out.println("Wrap methos of cub");
    }
}







public class MultilevelInheritance {
    public static void main(String[] args) {
        Cub c = new Cub();
        c.weaps();
        c.eat();
        c.rore();
    }
}
