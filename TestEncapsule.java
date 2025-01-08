package MyPackage;

public class TestEncapsule{
	public static void main(String[] a) {
		AccountEx a1 = new AccountEx();
		System.out.println("Account Number : "+ a1.getAcc_no());
		a1.setName("Vaibhav");
		System.out.println("Name : "+ a1.getName());
		a1.setAge(50);
		System.out.println("Age : "+ a1.getAge());
		a1.setBalance(9090);
		System.out.println("Balance :" + a1.getBalance() );
	} 
}