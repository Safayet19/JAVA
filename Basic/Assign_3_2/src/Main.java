import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter any text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        int vowel = 0;
        int cons = 0;

        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
            || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'A'
            || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O')
                vowel++;
            else
                cons++;
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonents: " + cons);
    }
}