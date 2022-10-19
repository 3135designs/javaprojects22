import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        String greeting;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the greeting: ");
        greeting = userInput.next();

        System.out.println(greeting);

    }

}
