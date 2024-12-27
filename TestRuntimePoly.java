class Bank{
    void getrateofinterest(){System.out.println(0);}
}

class SBI extends Bank{
    void getrateofinterest(){System.out.println(7);}
}


class AXIS extends Bank{
    void getrateofinterest(){System.out.println(8);}
}

public class TestRuntimePoly {
    public static void main(String[] args) {
        Bank b ;
        b = new SBI();
        b.getrateofinterest();
        b = new AXIS();
        b.getrateofinterest();
    }
}
