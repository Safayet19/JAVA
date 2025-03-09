import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter your name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.print("Enter your id : ");
        long id = input.nextLong();

        System.out.print("Enter Your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.println("Name: "+name+"\nID: "+id+"\nCGPA : "+cgpa);





    }
}