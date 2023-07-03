public class Store9 {
  // instance fields
  String productType;
  
  // constructor method
  public Store9(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store9 cookieShop = new Store9(cookie);
    
    cookieShop.advertise();
  }
}