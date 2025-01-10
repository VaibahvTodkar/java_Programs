abstract class Game {
    abstract public double calculateIncome(String numGames);  // calculatethe income of the player
    abstract public double calculateBonus(String performance, String grade);  //calculate the bonus based on their performance
}


class TestMatch extends Game {
   public  double calculateIncome(String numGames){
        int games = Integer.parseInt(numGames);
        double income = games * 10000;
        return income;
    }

    public double calculateBonus(String performance, String grade) {
        double bonus = 0;
        switch (performance) {
            case "Best":
                bonus = 50000;
                break;
            case "Good":
                bonus = 25000;
                break;
            case "Average":
                bonus = 5000;
                break;
        }

        if (grade == "A") {
            bonus = bonus * 2; 
        }else if(grade == "B"){
            bonus = bonus * 1;
        }else{
            System.out.println("Sorry Next Time");
        }

        return bonus;
    }  
}



class WorldCup extends Game {
    public  double calculateIncome(String numGames){
        int games = Integer.parseInt(numGames);
        double income = games * 10000;
        return income;
    }

    public double calculateBonus(String performance, String grade) {
        double bonus = 0;
        switch (performance) {
            case "Best":
                bonus = 50000;
                break;
            case "Good":
                bonus = 25000;
                break;
            case "Average":
                bonus = 5000;
                break;
        }

        if (grade == "A") {
            bonus = bonus * 2; 
        }else if(grade == "B"){
            bonus = bonus * 1;
        }else{
            System.out.println("Sorry Next Time");
        }

        return bonus;
    }  
}



class Player {
    String name;
    int age;
    String gender;

    Player(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void displayDetails(String match, String numGames, String performance, String grade){
        Game game ;
        if(match == "TestMatch"){
            game = new TestMatch();
        }else{
            game = new WorldCup();
        }

        double income = game.calculateIncome(numGames);
        double bonus = game.calculateBonus(performance, grade);

        System.out.println("Player Name : " + name);
        System.out.println("Player age : " + age);
        System.out.println("Player gender : " + gender);
        System.out.println("Player Income : " + income);
        System.out.println("Player IBonus : " + bonus);

    }
    
    
}


public class PlayerTest {
    public static void main(String[] args) {
        Player  p = new Player("Vaibhav Todkar", 21, "Male");
        p.displayDetails("TestMatch", "3", "Best", "A");

        p.displayDetails("TestMatch", "5", "Good", "B");
    }
}