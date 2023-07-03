public class Store8 {
  // instance fields
  String productType;
  
  // constructor method
  public Store8(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
		System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // main method
  public static void main(String[] args) {
    Store8 lemonadeStand = new Store8("Lemonade");
    lemonadeStand.advertise();
    lemonadeStand.advertise();
    lemonadeStand.advertise();
  }
}