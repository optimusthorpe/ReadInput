import java.util.Scanner;

public class ReadInput { 
    public static void main (String [] args)
    {
        System.out.println("Enter a letter");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
}