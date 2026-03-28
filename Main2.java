class InvoiceProcessor 
{
    public void generate(double amt) 
{
        System.out.println("Invoice: " + calc(amt));
    }
    private double calc(double amt)
 {
 return amt + 50; 
}
    public void accessPrivate(double amt)
 {
 System.out.println(calc(amt)); }
}

class RetailInvoice extends InvoiceProcessor
 {
    public void generate(double amt)
 {
        double discount = amt * 0.1;
        System.out.println("Retail Invoice: " + (amt - discount));
    }
}
public class Main2 {
    public static void main(String[] args) {
        InvoiceProcessor ref = new RetailInvoice();
        ref.generate(1000);
        ref.accessPrivate(1000);
    }
}