public class ToStringTest {
	int id ;
	String name;
	ToStringTest(int id , String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return id + " " + name;
	}
	public static void main(String[] a){
		ToStringTest ob = new ToStringTest(101, "ASDF");
		ToStringTest ob2 = new ToStringTest(102, "eere");
		System.out.println(ob);
		System.out.println(ob2);

	} 
}