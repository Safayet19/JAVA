import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.print("Enter your birth year: ");
        int year = input.nextInt();
        int d = 2025 - year;

        System.out.println("Hello, "+name+"! Your Birth Year is "+year+" and you are "+d+" years old.");
    }
}