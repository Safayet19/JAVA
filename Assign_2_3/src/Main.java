import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the length of the rectangle: ");
        Scanner input = new Scanner(System.in);

        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is " + area+" square feet.");
    }
}