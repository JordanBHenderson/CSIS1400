import java.util.Scanner;


public class CalculateATipJordanHenderson
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("11.50");
        double bill = input.nextDouble();
        
        double Tip = bill * 0.18;
        System.out.println("tip is 0.18" + (int)(bill * 0.18));
        
        
        
        
    }
    
}
