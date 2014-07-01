package compoundinterest.jordan.henderson;

import java.util.Scanner; // Scanner is in the java.util Package
public class CompoundInterestJordanHenderson
{
    
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter a Radius
        System.out.print("1 2 3: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble ();
        double number3 = input.nextDouble();
        
        //Compute average
        double average = (number1 + number2 + number3) /3;
        
        // Display results
        System.out.println("The average of" + number1 + "1" + number2 
        + "2" + number3 + "is" + average);
    }   
    
}
