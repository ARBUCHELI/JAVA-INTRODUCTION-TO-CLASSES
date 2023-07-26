public class Store10 {
  // instance fields
  String productType;
  
  // constructor method
  public Store10(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }

  // greetCustomer method
  public void greetCustomer(String customer) {
    System.out.println("Welcome to the store, " + customer + "!");
  }
  
  // main method
  public static void main(String[] args) {
    Store10 lemonadeStand = new Store10("Lemonade");
    lemonadeStand.greetCustomer("Shraga");
  }
}