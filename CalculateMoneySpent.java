import java.util.Scanner;

public class CalculateMoneySpent{
	public static void main( String[] args){
        String name ;
        int moneySpent , total , totalDay ;
        double average ;
        
		Scanner keyboard = new Scanner(System.in);

        System.out.print("Hey. What is your name? ");
        name = keyboard.next();

        System.out.println("How much money did you spent at the club on Monday? ");
		moneySpent = keyboard.nextInt();

        System.out.println("How much money did you spent at the club on Tuesday? ");
		moneySpent = moneySpent + keyboard.nextInt();

        System.out.println("How much money did you spent at the club on Wednesday? ");
		moneySpent = moneySpent + keyboard.nextInt();

        System.out.println("How much money did you spent at the club on Thursday? ");
		moneySpent = moneySpent + keyboard.nextInt();

        System.out.println("How much money did you spent at the club on Friday? ");
		moneySpent = moneySpent + keyboard.nextInt();

        System.out.println("How much money did you spent at the club on Saturday? ");
		moneySpent = moneySpent + keyboard.nextInt();

        System.out.println("How much money did you spent at the club on Sunday? ");
		moneySpent = moneySpent + keyboard.nextInt();

        System.out.println("The Calculation Results : ");
        System.out.println("Hi " + name + ". ");
        // total = moneySpent;
        // boleh dipake buat penjumlahan atau engga
        totalDay =(7);
        average = moneySpent / totalDay;
        System.out.println("Your total exoenditure at the club this week is $" + moneySpent );
        System.out.println("With an average daily expenditure of $" + average);
        
       
    }
}