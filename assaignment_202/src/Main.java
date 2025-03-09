import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int age = 2025-birthYear;

        System.out.println("Hello, " + name + "! Your birth year is "+ birthYear+"and you are "+age+" years old.");
    }
}