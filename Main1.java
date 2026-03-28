class Notifier 
{
    public void send(String msg) 
 { 
   System.out.println("General: " + msg); 
 }
    protected void send(String msg, String email) 
 { 
   System.out.println("Email to " + email); 
  }
    void send(String msg, long phone) 
{ 
System.out.println("SMS to " + phone); 
}
    private void send(String msg, int code) 
{ 
System.out.println("Private alert"); 
}
    public void accessPrivate() 
{ 
send("hidden", 1); 
}
}

class AppNotifier extends Notifier 
{
    void test() 
  {
        send("Hello");
        send("Hi", "test@mail.com");
        send("Hey", 9876543210L);
        accessPrivate();
    }
}

public class Main1 
{
    public static void main(String[] args) 
 {
        AppNotifier a = new AppNotifier();
        a.test();
    }
}