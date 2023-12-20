import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create Scanner object for user input
        Scanner usrIn = new Scanner(System.in);
        //Create Scanner obj for tipAmt
        Scanner usrTip = new Scanner(System.in);
        //Declare double bill amt as user input sc.Scanner(System.in)
        double billAmt = usrIn.nextDouble();
        //Declare number of people as user input
        int numOfPeople = usrIn.nextInt();
        //Declare double tip percent as user input number / 100
        double convertTip = usrTip.nextDouble() / 100;
        //Create total tip amount by multiplying billAmt by convertTip
        double tipAmt = convertTip * billAmt;
        double totalAmt = billAmt + tipAmt;
        //create function that adds bill amt, tipAmt / numOfPeople
        System.out.println(totalAmt / numOfPeople);
    }

}