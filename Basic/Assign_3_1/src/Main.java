import java.util.Scanner;

public class Main
{
    public static void sum(int a, int b)
    {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " +sum);
    }

    public static void diff(int a, int b)
    {
        int diff = a - b;
        System.out.println("Differnce between " + a + " and " + b + " is " + diff);
    }
    public static void product(int a, int b)
    {
     int product = a*b;
     System.out.println("Product of " + a + " and " + b + " is " + product);
    }
    public static void div(int a, int b)
    {
        if(b == 0)
        {
            System.out.println("Error");
            return;
        }
        else
        {
            double div = (double)a/b;
            System.out.println("Division of " + a + " and " + b + " is " + div);
        }

    }

    public static void main(String[] args)
    {
        System.out.print("Enter first Number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Enter second Number: ");
        int b = input.nextInt();
        sum(a, b);
        diff(a, b);
        product(a, b);
        div(a, b);


    }
}