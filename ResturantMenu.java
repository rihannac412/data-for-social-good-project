public class RestaurantMenu {
  private String[] items;
  private int[] calories;
  private double[] totalFat;

  
// no argument constructor
public RestaurantMenu() {
  this("items.txt", "calories.txt", "totalFat.txt");
}

  
// parameterized constructor
  public RestaurantMenu(String itemsFile, String caloriesFile, String totalFatFile) {
    items = FileReader.toStringArray(itemsFile);
    calories = FileReader.toIntArray(caloriesFile);
    totalFat = FileReader.toDoubleArray(totalFatFile);
  }

  
/*
 * finds the item with the fewest calories
 * Precondition: arrays are not empty
 * Postcondition: returns the item with the least calories
 */
  public String lowestCalories() {
    if (items.length == 0) {
      return "No menu items available";
    }

    int lowest = 0;

    for (int i = 0; i < calories.length; i++) {
      if (calories[i] < calories[lowest]) {
        lowest = i;
      }
    }

    return items[lowest] + ": " + calories[lowest] + " calories";
  }

  
/*
 * finds the item with the least totalFat
 * Precondition: arrays are not empty
 * Postcondition: returns the item with the least totalFat
 */
  public String lowestFat() {
    if (items.length == 0) {
      return "No menu items available";
    }

    int lowest = 0;

    for (int i = 0; i < totalFat.length; i++) {
      if (totalFat[i] < totalFat[lowest]) {
        lowest = i;
      }
    }

    return items[lowest] + ": " + totalFat[lowest] + "g total fat";
  }

/*
 * creates a new array of items with less than 100 calories
 * Precondition: all arrays contain same type of data
 * Postcondition: returns an array of low calorie items (100 or less)
 */
  public MenuItem[] getLowCalorieItems() {
    int count = 0;

    for (int i = 0; i < calories.length; i++) {
      if (calories[i] < 100) {
        count++;
      }
    }

   
 MenuItem[] lowCalorie = new MenuItem[count];
 int in = 0;

   for (int i = 0; i < calories.length; i++) {
      if (calories[i] < 100) {
      lowCalorie[in] = new MenuItem(items[i], calories[i], totalFat[i]);
    in++;
  }
}

return lowCalorie;
  }
}
