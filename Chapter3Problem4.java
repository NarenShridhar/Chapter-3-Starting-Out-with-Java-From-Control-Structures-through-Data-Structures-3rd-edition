// Chapter 3 Page 185
// Programming Challenges #4

import javax.swing.JOptionPane;

public class Chapter3Problem4
{
   public static void main(String[] args)
   {
      int testScore1;
      int testScore2;
      int testScore3;
      int averageScore;
      String input;
      
      input = JOptionPane.showInputDialog("enter the value of your first " +
                                   "test score");
      testScore1 = Integer.parseInt(input);
      
      input = JOptionPane.showInputDialog("enter the value of your second " +
                                   "test score");
      testScore2 = Integer.parseInt(input);
      
      input = JOptionPane.showInputDialog("enter the value of your third " +
                                   "test score");
      testScore3 = Integer.parseInt(input);
      
      averageScore = (testScore1 + testScore2 + testScore3)/3;
      
      JOptionPane.showMessageDialog(null,
                             "Your average score is: " + averageScore);
      if (averageScore >= 90)
         JOptionPane.showMessageDialog(null,
                                "Your grade is an A " + 
                                "Fantastic Job! Keep Aiming for the stars!");
      else if (averageScore >= 80)
         JOptionPane.showMessageDialog(null,
                                "Your grade is a B " + 
                                "You're doing well, but fantastic is right " +
                                "around the corner, why stop here friend");
      else if (averageScore >= 70)
         JOptionPane.showMessageDialog(null,
                                "Your grade is a C " + 
                                "Average. We talkin bout practice?!");
      else if (averageScore >= 60)
         JOptionPane.showMessageDialog(null,
                                "Your grade is a D " + 
                                "Damn, you're trash. Potentially beyond repair");
      else         
         JOptionPane.showMessageDialog(null,
                                "Your grade is an E " + 
                                "Beyond repair, consider a career change");
      
      System.exit(0); 
   }
}