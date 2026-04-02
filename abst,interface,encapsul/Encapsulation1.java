class BankAccount
{
 private double balance;
 public void setBalance(double amount)
 {
  if (amount>=500)
   balance=amount;
  else
   System.out.println("Minimum amount required is 500");
 }
 public double getBalance()
 {
  return balance;
 }
}
public class Encapsulation1
{
 public static void main(String args[])
 {
  BankAccount b=new BankAccount();
  b.setBalance(500);
  b.setBalance(2000);
  System.out.println(b.getBalance());
 }
}