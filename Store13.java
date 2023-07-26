public class Store13 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store13(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store13 lemonadeStand = new Store13("Lemonade", 3.75);
    Store13 cookieShop = new Store13("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }

  public String toString() {
    return "This store sells " + productType + " at a price of " + price + ".";
  }
}