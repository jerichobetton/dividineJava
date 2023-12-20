import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Dividine, your bill-splitting assistant! Press the 'Enter' key to continue.");
        String input = scanner.nextLine();

        System.out.println("Please enter the total of the bill you would like to split: ");
        double billAmt = scanner.nextDouble();

        System.out.println("Enter the percentage that you would like to tip.");
        //convert input to percentage first
        double convertTip = scanner.nextDouble() / 100;
        double tipAmt = convertTip * billAmt;

        //Declare number of people as user input
        System.out.println("How many people are you splitting this bill with?");
        int numOfPeople = scanner.nextInt();

        //Create total tip amount by multiplying billAmt by convertTip
        double totalAmt = billAmt + tipAmt;

        double dividedAmt = totalAmt / numOfPeople;

        //create function that adds bill amt, tipAmt / numOfPeople
        System.out.println("Everyone owes $"+dividedAmt);
        scanner.close();
    }
}