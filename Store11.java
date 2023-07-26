public class Store11 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store11(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store11 lemonadeStand = new Store11("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
  }
}