import java.util.Scanner;

public class Tempconvert 
{
    public static void main(String[] args)
    {
        Scanner userTemp = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");

        int celsius = userTemp.nextInt();
        
        int fahr = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is " + fahr + " Fahrenheit");
    }
}
