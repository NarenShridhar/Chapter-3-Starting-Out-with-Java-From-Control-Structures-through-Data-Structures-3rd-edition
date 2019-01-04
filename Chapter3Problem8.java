// Chapter 3 Page 185
// Programming Challenges #8

import javax.swing.JOptionPane;

public class Chapter3Problem8
{
   public static void main(String[] args)
   {
      double packagesPurchased;
      double twentyPercentOfPackagesPurchased;
      double thirtyPercentOfPackagesPurchased;
      double fourtyPercentOfPackagesPurchased;
      double fiftyPercentOfPackagesPurchased;
      double valueOfOnePackage;
      double valueOfPackagesPurchased;
      String input;
      
      input = JOptionPane.showInputDialog("Enter the number " +
                                   "of packages purchased");
      packagesPurchased = Double.parseDouble(input);
      
      valueOfOnePackage = 99;
      
      valueOfPackagesPurchased = packagesPurchased*valueOfOnePackage;
      
      twentyPercentOfPackagesPurchased = valueOfPackagesPurchased*0.2;
      
      thirtyPercentOfPackagesPurchased = valueOfPackagesPurchased*0.3;
      
      fourtyPercentOfPackagesPurchased = valueOfPackagesPurchased*0.4;
      
      fiftyPercentOfPackagesPurchased = valueOfPackagesPurchased*0.5;
      
      if (packagesPurchased >= 10 && packagesPurchased <= 19)
      {
         JOptionPane.showMessageDialog(null,
                                "The amount of your discount is 20% \n" +
                                "The total amount of your purchase before " + 
                                "the discount is: $" + valueOfPackagesPurchased + 
                                "\nThe amount of the discount itself is $" + 
                                twentyPercentOfPackagesPurchased + "\nThe total " + 
                                "value of the purchase after the discount is: $" +
                                (valueOfPackagesPurchased - twentyPercentOfPackagesPurchased));
                                
      }
      
      else if (packagesPurchased >= 20 && packagesPurchased <= 49)
      {
         JOptionPane.showMessageDialog(null,
                                "The amount of your discount is 30% \n" + 
                                "The total amount of your purchase before " + 
                                "the discount is: $" + valueOfPackagesPurchased +
                                "\nThe amount of the discount itself is $" + 
                                thirtyPercentOfPackagesPurchased + "\nThe total " +
                                "value of the purchase after the discount is: $" +
                                (valueOfPackagesPurchased - thirtyPercentOfPackagesPurchased));
      }
                                

   }
}