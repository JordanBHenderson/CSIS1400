import java.util.Scanner;


public class CalculateATipJordanHenderson
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    //Prompt for Bill
    System.out.println("Please enter the total for your bill.");
    double bill = input.nextDouble();

    //Prompt for desired tip percent
    System.out.println("Please enter your tip percent. Example: for 15% tip, enter \"15\".");
    double tipPercent = input.nextDouble() / 100;

    //Calc the tip
    double tip = bill * tipPercent;

    //Calc the total bill
    double totalBill = bill + tip;

    //Show the total bill
    System.out.println("Your total bill is: " + totalBill);
  }
    
}
