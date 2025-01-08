public class TestStringBuffer{
	public static void main(String args[]){
		StringBuffer s = new StringBuffer("Hello");
		
		System.out.println(s);
		//System.out.println("String with Construcort argument : " + s.capacity());
		//System.out.println("Length : " + s.length());
		//System.out.println("Character at 4 : " + s.charAt(4));
		//System.out.println("Insert At index 7 Todkar : " + s.insert(7, "Todkar"));
		s.replace(1, 2, "java");
		System.out.println(s);
		

		//StringBuffer s1 = new StringBuffer();
		//System.out.println(s1);
		//System.out.println("String with defoult Construcort : " + s1.capacity());
		//System.out.println("Length : " + s1.length());

		//StringBuffer s2 = new StringBuffer(100);
		//System.out.println(s2);
		//System.out.println("String with Construcort capacity : " + s2.capacity());
		//System.out.println("Length : " + s2.length());



		// Methods
		// append
		// length
		// capacity
		// charAt
		// insert
		// replace
	}
}