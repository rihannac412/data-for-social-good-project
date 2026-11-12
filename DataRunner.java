import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
    
// creates an object using text files
    RestaurantMenu mcDonalds = new RestaurantMenu("items.txt", "calories.txt", "totalFat.txt");

// item with the least calories
    System.out.print("Lowest calories:");
    System.out.println(mcDonalds.lowestCalories());

// item with the least fat
    System.out.print("Lowest fat:");
    System.out.println(mcDonalds.lowestFat());

// array of items under 100 calories
    MenuItem[] lowCalorie = mcDonalds.getLowCalorieItems();

    System.out.println("Items Under 100 Calories:");

    for (MenuItem item : lowCalorie) {
      System.out.println(item);
    }
  }
}
