public class SavingsAccount2 {
  
  int balance;
  
  public SavingsAccount2(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is "+ balance);
  }

  public void deposit(int amountToDeposit) {
     int afterDeposit = balance + amountToDeposit;
     balance = afterDeposit;
     System.out.println("You just deposited "+ amountToDeposit);
  }

  public int withdraw(int amountToWithdraw) {
    int afterWithdraw = balance - amountToWithdraw;
    balance = afterWithdraw;
    System.out.println("you just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount2 savings = new SavingsAccount2(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);

    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance(); 
  }       
}