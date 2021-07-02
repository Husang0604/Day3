import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        ArrayList<Food> foodList = new ArrayList<Food>();
        while(true) {
            System.out.println("what do you want?");
            String food = scan.nextLine();
            System.out.println("From what country");
            String country = scan.nextLine();
            System.out.println("what date?");
            int date = Integer.parseInt(scan.nextLine());
            Food food1 = new Food(food, country, date);
            
            foodList.add(food1);
            for(int i = 0; i < foodList.size(); i++) {
                foodList.get(i).printEverything();
            }
        }

    }
}

class Food {
    private String name;
    String country;
    int date;
    private String taste;
    
    Food() {

    }

    Food(String _name, String _country, int _date) {
        name = _name;
        country = _country;
        date = _date;
    }

    public void setTaste(String _taste) {
        taste = _taste;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getTaste() {
        return taste;
    }
    
    public String getName() {
        return name;
    }
    
    public void printEverything() {
        System.out.println(name);
        System.out.println(date);
        System.out.println(country);
    }

}