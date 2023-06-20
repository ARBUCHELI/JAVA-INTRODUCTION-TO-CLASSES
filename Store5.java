public class Store5 {
  // instance fields
  String productType;
  
  // constructor method
  public Store5(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    Store5 lemonadeStand = new Store5("lemonade");
    System.out.println(lemonadeStand.productType);
  }
}