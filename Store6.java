public class Store6 {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  // constructor method
  public Store6(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store6 cookieShop = new Store6("cookies", 12, 3.75);
  }
}