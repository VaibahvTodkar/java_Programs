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



public class TestInheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
        t.rore();
    }
}
