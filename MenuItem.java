public class MenuItem {
  
  private String name;
  private int calories;
  private double totalFat;

// no argument constructor
 public MenuItem() {
  name = "Unknown";
  calories = 0;
  totalFat = 0.0;
}

// parameterized constructor
  public MenuItem(String name, int calories, double totalFat) {
    this.name = name;
    this.calories = calories;
    this.totalFat = totalFat;
  }

// returns the name of the menu item
  public String getName() {
    return name;
  }

// returns the calories
  public int getCalories() {
    return calories;
  }

// returns the amount of fat
  public double getTotalFat() {
    return totalFat;
  }

// returns information about the menu item
  public String toString() {
    return name + ": " + calories + " calories, " + totalFat + "g fat";
  }
}
