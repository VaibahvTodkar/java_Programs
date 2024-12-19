public class CopyObjectData {
    int id;
    String name;
    CopyObjectData(int i, String n){
        id =i;
        name = n;
    }
    CopyObjectData(){

    }

    public void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyObjectData c1 = new CopyObjectData(111, "Sam");
        CopyObjectData c2 = new CopyObjectData();
        c2.id =c1.id;
        c2.name = c1.name;
        // c2 =c1;
        c1.display();
        c2.display();
    }
}
