public class TestStringBuffer{
	public static void main(String args[]){
		StringBuffer s = new StringBuffer("Hello");
		StringBuffer s1 = new StringBuffer();

		
		//System.out.println(s);
		//System.out.println("String with Construcort argument : " + s.capacity());
		//System.out.println("Length : " + s.length());
		//System.out.println("Character at 4 : " + s.charAt(4));
		//System.out.println("Insert At index 7 Todkar : " + s.insert(7, "Todkar"));
		//System.out.println("Replace Method : " + s.replace(1, 2, "java"));
		//System.out.println("Delete the string : " + s.delete(2, 4));
		//System.out.println("Reverse the string : " + s.reverse());
		

		// capacity Methods
		//System.out.println("Capacity : " + s.capacity());
		//s.append("java is my favorite languages");
		//System.out.println("Capacity  After append : " + s.capacity());
		//System.out.println(s);

		// s1 capacity  
		//System.out.println("S1 capacity : " + s1.capacity());
		//s1.append("Hello");
		//System.out.println("S1 capacity after append 1 : " + s1.capacity());
		//System.out.println("Length : " + s1.length());
		//s1.append("java is my favorite languages");
		//System.out.println("S1 capacity after append 2 : " + s1.capacity());
		//System.out.println("Length : " + s1.length());
		//s1.append("java is my favorite languages in the year 2025");
		//System.out.println("S1 capacity after append 3 : " + s1.capacity());
		//System.out.println("Length : " + s1.length());

		// s1 ensurecapacity 
		//s1.append("Hello");
		//System.out.println("Capacity : " + s1.capacity());
		//s1.ensureCapacity(10);
		//s1.ensureCapacity(50);
		//System.out.println("Capacity : " + s1.capacity());

		
		// subString() method
		s1.append("Hello");
		System.out.println("Substring from 1 to 4 :" + s1.substring(1,4));
		System.out.println(s1);
		
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
		// replace(startindex, endindex, "String")
		// delete(startindex, endindex)
		// reverse()

		// subString(start, end)
	}
}