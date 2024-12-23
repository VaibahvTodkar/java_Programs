class Bank{
	int getrateofinterest(){
		return 0;
	}
}
class SBI extends Bank{
	int getrateofinterest(){
		return 7;
	}
}
class HDFC extends Bank{
	int getrateofinterest(){
		return 8;
	}
}
class Axis extends Bank{
	int getrateofinterest(){
		return 9;
	}
}
public class TestBankOverriding {
    public static void main(String[] args) {
        Bank b = new Bank();
	SBI sbi = new SBI();
	HDFC h = new HDFC();
	Axis a = new Axis();
	System.out.println("SBI : "+sbi.getrateofinterest());
	System.out.println("Bank : "+b.getrateofinterest());
	System.out.println("HDFC : "+h.getrateofinterest());
	System.out.println("Axis : "+a.getrateofinterest());
	
    }
}
