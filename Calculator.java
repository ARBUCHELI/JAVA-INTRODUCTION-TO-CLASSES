/*
This is an arithmetic calculator that performs addition, 
substraction, multiplication, and division on two integer
numbers
*/
public class Calculator {

  public Calculator(){

  }

  public int add(int a, int b) {
    int result = a + b;
    return result;
  }

  public int subtract(int a, int b) {
    int result = a - b;
    return result;
  }

  public int multiply(int a, int b) {
    int result = a * b;
    return result;
  }

  public int divide(int a, int b) {
    int result = a / b;
    return result;
  }

  public int module(int a, int b) {
    int result = a % b;
    return result;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
}