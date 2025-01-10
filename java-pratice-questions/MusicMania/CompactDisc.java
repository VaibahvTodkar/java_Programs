<<<<<<< HEAD
package cdpkg;

public class CompactDisc{
	String id;
	String type; // music or video
	String artist; // name

	public double price;
	public final static float discount = 5;


	// constructor
	
	public CompactDisc(String id, String type, String artist, double price ){
		this.id = id;
		this.type = type;
		this.artist = artist;
		this.price = price;

	}

	public void compactDiscDisplay(){
		System.out.println("CompactDisc ID : " + id);
		System.out.println("CompactDisc type : " + type);
		System.out.println("CompactDisc artist : " + artist);

		// price -= price * (5/100);-
		System.out.println("CompactDisc Price : " + price);
	}

	
}


=======
package cdpkg;

public class CompactDisc{
	String id;
	String type; // music or video
	String artist; // name

	public double price;
	public final static float discount = 5;


	// constructor
	
	public CompactDisc(String id, String type, String artist, double price ){
		this.id = id;
		this.type = type;
		this.artist = artist;
		this.price = price;

	}

	public void compactDiscDisplay(){
		System.out.println("CompactDisc ID : " + id);
		System.out.println("CompactDisc type : " + type);
		System.out.println("CompactDisc artist : " + artist);

		// price -= price * (5/100);-
		System.out.println("CompactDisc Price : " + price);
	}

	
}


>>>>>>> 866d07f84247afee22be6a312e7e36bc7e44a9ad
