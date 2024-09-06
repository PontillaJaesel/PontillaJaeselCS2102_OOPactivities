import java.util.Scanner;

public class GettingGreater 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting the Greater Value");

        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);

        System.out.print("Enter first character: ");
        char ch2 = scanner.next().charAt(0);

        int asciiValue1 = ch1;
        int asciiValue2 = ch2;

        System.out.println("-------------------------------------------");
        System.out.print("The character with greater value is: "); 
        System.out.println((char) Math.max(ch1,ch2));
        System.out.println("-------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println("f: " + asciiValue1);
        System.out.println("f: " + asciiValue2);
    }
}
