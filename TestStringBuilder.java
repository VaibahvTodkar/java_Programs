public class TestStringBuilder{
	public static void main(String[] args ) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Good");
		StringBuilder sb3 = new StringBuilder(50);
		
		System.out.println("Capacity  : " + sb.capacity());
		System.out.println("Length : " + sb.length()); 

		System.out.println("Capacity : " + sb2.capacity());
		System.out.println("Length : " + sb2.length()); 

		System.out.println("Capacity : " + sb3.capacity());
		System.out.println("Length : " + sb3.length()); 
	}

}