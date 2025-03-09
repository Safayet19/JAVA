import java.util.Scanner;

public class Main
{
    public static void largest(int a, int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println("Large number : "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Large number : "+b);
        }
        else
            System.out.println("Large number : "+c);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        largest(a,b,c);


    }
}