import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the length of the rectangle: ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        double area = length * width;
        System.out.println("The area of the rectangle is " + area +" square units.");
    }
}