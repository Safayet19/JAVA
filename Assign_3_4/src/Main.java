import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Tenperature in Farenheit: ");
        Scanner input = new Scanner(System.in);
        double t = input.nextDouble();

        double celsius = (t-32)*5/9;
        System.out.println("Celsius: " + celsius);
    }
}