public class ToStringTest2 {
		String str1;
		ToStringTest2(String str1){
			this.str1= str1;
		}
		public String toString(){
			return str1;
		}
		public static void main(String[] a){
		String s = new String("Hello");
		System.out.println(s);
		ToStringTest2 ob = new ToStringTest2("ASDF");
		System.out.println(ob);
		System.out.println(ob);
		

	} 
}