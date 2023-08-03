import java.util.Scanner;

public class ForgetfulMachine{
    public static void main(String[] args){           
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city the capital of france?");
    keyboard.next();

    System.out.println("What is ( multiplied by ?)");
    keyboard.nextInt();

    System.out.println("Enter a number betweens 0.0 and 0.17");
    keyboard.nextDouble();

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();
    }
}