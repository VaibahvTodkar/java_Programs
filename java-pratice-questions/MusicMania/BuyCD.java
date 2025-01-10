<<<<<<< HEAD
package orderpkg;
import cdpkg.CompactDisc;


import java.text.CompactNumberFormat;

class Order  {
	String orderID;
	String custID;
	String custName;
	int quantity;
	
	double payableAmt = 0;

	Order(String orderId, String custID, String custName, int quantity){
		this.orderID = orderId;
		this.custID = custID;
		this.custName = custName;
		this.quantity = quantity;
		
	}

	public void calculatePayableAmount(double price, float discount){
		payableAmt = (quantity * price) - (discount/100) ;
		
		System.out.println("Order Details :");
		System.out.println("Order ID :" + orderID);
		System.out.println("Customer ID  :" + custID);
		System.out.println("Customer Name  :" + custName);
		System.out.println("Payable Amount :" + payableAmt);
	}
}

public class  BuyCD{

	public static void main(String[] args){
		
		CompactDisc cd = new CompactDisc("101", "Video", "VaibhavTodkar", 1000);
		Order o = new Order("111", "201", "Ramkumar", 5);
		cd.compactDiscDisplay();
		o.calculatePayableAmount(cd.price, cd.discount);
	}

=======
package orderpkg;
import cdpkg.CompactDisc;


import java.text.CompactNumberFormat;

class Order  {
	String orderID;
	String custID;
	String custName;
	int quantity;
	
	double payableAmt = 0;

	Order(String orderId, String custID, String custName, int quantity){
		this.orderID = orderId;
		this.custID = custID;
		this.custName = custName;
		this.quantity = quantity;
		
	}

	public void calculatePayableAmount(double price, float discount){
		payableAmt = (quantity * price) - (discount/100) ;
		
		System.out.println("Order Details :");
		System.out.println("Order ID :" + orderID);
		System.out.println("Customer ID  :" + custID);
		System.out.println("Customer Name  :" + custName);
		System.out.println("Payable Amount :" + payableAmt);
	}
}

public class  BuyCD{

	public static void main(String[] args){
		
		CompactDisc cd = new CompactDisc("101", "Video", "VaibhavTodkar", 1000);
		Order o = new Order("111", "201", "Ramkumar", 5);
		cd.compactDiscDisplay();
		o.calculatePayableAmount(cd.price, cd.discount);
	}

>>>>>>> 866d07f84247afee22be6a312e7e36bc7e44a9ad
}