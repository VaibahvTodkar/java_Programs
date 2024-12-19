// Person class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Room class
class Room {
    int roomNumber;
    boolean isOccupied;

    Room(int roomNumber, boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.isOccupied = isOccupied;
    }

    void checkRoomStatus() {
        System.out.println("Room " + roomNumber + (isOccupied ? " is occupied." : " is available."));
    }
}

// Watch class
class Watch {
    String brand;
    double price;

    Watch(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void showTime() {
        System.out.println("Showing time for the brand: " + brand);
    }
}

// Student class
class Student {
    String studentName;
    int rollNumber;

    Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    
    void displayStudentInfo() {
        System.out.println("Student Name: " + studentName + ", Roll Number: " + rollNumber);
    }
}

// Book class
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void readBook() {
        System.out.println("Reading the book: " + title + " by " + author);
    }
}

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Account " + accountNumber + " has a balance of: $" + balance);
    }
}

// Mobile class
class Mobile {
    String model;
    String brand;

    Mobile(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    void makeCall(String number) {
        System.out.println("Calling " + number + " from " + brand + " " + model);
    }
}

// Main class to test all the above classes
public class MainAssignment {
    public static void main(String[] args) {
        // Testing Person
        Person person = new Person("John", 25);
        person.displayPersonInfo();

        // Testing Room
        Room room = new Room(101, true);
        room.checkRoomStatus();

        // Testing Watch
        Watch watch = new Watch("Rolex", 5000.0);
        watch.showTime();

        // Testing Student
        Student student = new Student("Alice", 10);
        student.displayStudentInfo();

        // Testing Book
        Book book = new Book("1984", "George Orwell");
        book.readBook();

        // Testing Account
        Account account = new Account("12345678", 2500.50);
        account.checkBalance();

        // Testing Mobile
        Mobile mobile = new Mobile("iPhone 14", "Apple");
        mobile.makeCall("+1234567890");
    }
}
