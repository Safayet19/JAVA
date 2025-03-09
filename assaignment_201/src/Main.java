import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Your height in feet: ");
        double height = sc.nextDouble();

        System.out.println("Hello, "+name+"! You are "+age+" years old and your height is "+height+" feet.");
    }
}