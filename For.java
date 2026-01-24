import java.util.*;
public class For 
{
 public static void main(String[] args) 
 {
  boolean result = false;
  for (int n = 1; n <= 10; n++)
  {
   for (int i = 1; i <= 100; i++) 
   {
    if (i % (n * 2) != 0) 
	{
     System.out.println(i);
    } 
	else 
	{
     System.out.println(result);
    }
   }
  }
 }
}


