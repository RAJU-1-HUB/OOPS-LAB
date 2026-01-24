import java.util.*;
public class Break 
{
 public static void main(String args[]) 
 {
  int i;
  for (i = 1; i <= 100; i++) 
  {
   if (i % 10 == 0) 
   {
    break;
   }
   System.out.println(i);
  }
  System.out.println("loop ended");
 }
}
