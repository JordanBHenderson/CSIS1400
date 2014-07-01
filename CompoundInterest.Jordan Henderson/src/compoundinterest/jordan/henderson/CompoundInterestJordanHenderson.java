package compoundinterest.jordan.henderson;

import javax.swing.JOptionPane;

public class CompoundInterestJordanHenderson
{
    
   public static void main(String[] args)
    {

      //Prompt for Deposit Amount and Interest Rate
      String sMonthlyDepositAmount = JOptionPane.showInputDialog("Please Enter The Amount You\nWill Deposit Each Month");
      String sAnnualInterestRate = JOptionPane.showInputDialog("Please Enter The Annual Interest Rate.\nExample: type \"5\" for 5% annual interest");

      //Convert the strings to floats
      float fMonthlyDepositAmount = Float.parseFloat(sMonthlyDepositAmount);
      float fAnnualInterestRate = Float.parseFloat(sAnnualInterestRate) / 100;

      //Calc monthly APR
      float monthlyInterestRate = fAnnualInterestRate / 12;

      //Initialize the Total as zero
      float totalInAccount = (float) 0.00;

      for(int i = 0; i < 6; i++){
        totalInAccount = (fMonthlyDepositAmount + totalInAccount) * (1 + monthlyInterestRate);
      }

      //Show the user the total
      JOptionPane.showMessageDialog(null, "Your total account balance after 6 months is: " + totalInAccount, "Your total account balance after 6 months is: " + totalInAccount, JOptionPane.INFORMATION_MESSAGE);
      System.out.println("I AM DONE");
    }
    
}
