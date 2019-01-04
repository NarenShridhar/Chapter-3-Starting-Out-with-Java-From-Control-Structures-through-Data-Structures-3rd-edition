// Chapter 3 Page 185
// Programming Challenges #3

import javax.swing.JOptionPane;

public class Chapter3Problem3
{
   public static void main(String[] args)
   {
      double weightInPounds;
      double heightInInches;
      String input;
      
      input = JOptionPane.showInputDialog("What is your weight in pounds?");
      weightInPounds = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("What is your height in inches?");
      heightInInches = Double.parseDouble(input);
      
      double bodyMassIndex = weightInPounds * (703/(heightInInches*heightInInches));
      
      if (bodyMassIndex >= 18.5 && bodyMassIndex <= 25.0)
         JOptionPane.showMessageDialog(null,
                                "You have an optimal BMI! Way to go! :)");
                                
      if (bodyMassIndex < 18.5)
         JOptionPane.showMessageDialog(null,
                                 "You are underweight. Help yourself to " + 
                                 "some delicious pancakes! :)");
                                 
      if (bodyMassIndex > 25.0)
         JOptionPane.showMessageDialog(null,
                                 "You are overweight my friend, no consolation :(");
      
      System.exit(0);
      
   }
}   