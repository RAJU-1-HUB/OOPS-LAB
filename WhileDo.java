import java.util.*;

public class WhileDo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        boolean result = false;

        do {
            if (age >= 50) {
                System.out.println("older");
            } 
            else if (age >= 18) {
                System.out.println("elders");
            } 
            else {
                System.out.println("children");
            }
        } while (result);
    }
}
   