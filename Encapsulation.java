class BankAccount
{
    private double balance;
    public void setBalance(double balance){
        if(balance >0){
        this.balance = balance;
        } else{
            System.out.println("INVALID");
        }
    }
    public void withdraw(int amount)
    {
        if(amount >0 && balance >= amount){
        balance -= amount;
        System.out.println("Amount withdraw" + amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void deposit(int amount)
    {
        if(amount> 0 ){
            balance += amount;
            System.out.println("Amount credited "+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        BankAccount b=new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.withdraw(500);
        System.out.println(b.getBalance());
        b.deposit(2000000);
        System.out.println(b.getBalance());
    }

}