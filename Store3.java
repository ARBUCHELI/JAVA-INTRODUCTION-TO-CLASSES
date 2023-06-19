public class Store3 {
  // declare instance fields here!
  String productType;
  
  // constructor method
  public Store3() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    Store3 lemonadeStand = new Store3();
    
    System.out.println(lemonadeStand);
  }
}