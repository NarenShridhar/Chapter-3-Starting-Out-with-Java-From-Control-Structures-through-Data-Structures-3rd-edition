// Chapter 3 Page 185
// Programming Challenges #5

import javax.swing.JOptionPane;

public class Chapter3Problem5
{
   public static void main(String[] args)
   {
      double massInKilograms;
      double weightInNewtons;
      String input;
      
      input = JOptionPane.showInputDialog("enter object's mass in Kilograms");
      massInKilograms = Double.parseDouble(input);
      
      weightInNewtons = massInKilograms*9.8;
      
      if (weightInNewtons > 1000)
         JOptionPane.showMessageDialog(null, 
                                "Object is too heavy");
      
      if (weightInNewtons < 10)
         JOptionPane.showMessageDialog(null, 
                                "Object is too light");
         
      System.exit(0);
   }
}