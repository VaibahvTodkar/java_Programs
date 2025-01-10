interface Testing {

    void moveObject();
    void stopObject();
    void startObject();
    void turnObject();
}

class Toy implements Testing {
    String id;
    String name;
    double price;
    String color;
    String type;

    Toy(String id, String name, double price, String color, String type){
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public void toyDetails(){
        System.out.println("Toy id :"+  id);
        System.out.println("Toy name :"+  name);
        System.out.println("Toy price :" + price);
        System.out.println("Toy color :"+  color);
        System.out.println("Toy type :" + type);
    }

    public void moveObject() {
        System.out.println("Toy Moved");
    }

    public void stopObject() {
       System.out.println("Toy Stoped");
    }

    public void startObject() {
        System.out.println("Toy Started");
    }

    public void turnObject() {
       System.out.println("Toy Turned");
    }
}


class Order {
    String orderId;
    int quantity;
    double payableAmount;
    public Order(String orderId, int quantity, double payableAmount) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.payableAmount = payableAmount;
    }
    
    void orderDetails(){
        System.out.println("Order Id : " + orderId);
        System.out.println("Order quantity : " + quantity);
        System.out.println("Order Pay Able Amount : " + payableAmount * quantity);
    }

    static class Stock {
        public int getStock(String topId) {
            return 100;
        } 
    }
}

public class TestToy {
    public static void main(String[] args) {
        Toy toy = new Toy("101", "Robot", 50, "Red", "Machine");

        toy.toyDetails();

        toy.startObject();
        toy.moveObject();
        toy.turnObject();
        toy.stopObject();

        Order order = new Order("001", 2, 50);

        order.orderDetails();

        Order.Stock stock = new Order.Stock();
        int availableStock = stock.getStock("101");
        System.out.println("Available Stock for Toy ID 101: " + availableStock);

    }
}