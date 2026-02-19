class BankAccount {
    private double balance;

    public void deposit(double amount){
        balance+= amount;
    }
    public double getbalance(){
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        System.out.println("Balance: "+acc.getbalance());
    }
    
}
