import java.util.Scanner;

public class While
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        int student = 2;

        while (student <= 3)
		{
            System.out.println("Student " + student);

            System.out.print("Enter attendance percentage: ");
            int attendance = scanner.nextInt();

            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            if (attendance >= 75 && marks >= 40) {
                System.out.println("Result: Eligible / Pass");
            } else {
                System.out.println("Result: Not Eligible / Fail");
            }

            System.out.println("-----");
            student++;
        }
        
    }
}
