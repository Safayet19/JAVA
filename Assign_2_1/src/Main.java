import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        System.out.print("Enter Your height in feet: ");
        double height = input.nextDouble();

        System.out.println("Hello, "+name+"! You are "+age+" years old and your height is "+height+" feet");
    }
}