// Chapter 3 Page 184
// Programming Challenges #1

import javax.swing.JOptionPane;

public class Chapter3Problem1
{
   public static void main(String[] args)
      {
         double numberWithinRange;
         String input;
         
         input = JOptionPane.showInputDialog("Enter a # between 1-10");
         numberWithinRange = Double.parseDouble(input);
         
         if (numberWithinRange < 1 || numberWithinRange > 10)
            JOptionPane.showMessageDialog(null,
                                   "error, invalid selection, try again");

         if (numberWithinRange == 1)
            JOptionPane.showMessageDialog(null,
                                   "I");
         if (numberWithinRange == 2)
            JOptionPane.showMessageDialog(null,
                                   "II");
         
         if (numberWithinRange == 3)
            JOptionPane.showMessageDialog(null,
                                   "III");
         
         if (numberWithinRange == 4)
            JOptionPane.showMessageDialog(null,
                                   "IV");
         
         if (numberWithinRange == 5)
            JOptionPane.showMessageDialog(null,
                                   "V");
         
         if (numberWithinRange == 6)
            JOptionPane.showMessageDialog(null,
                                   "VI");
         
         if (numberWithinRange == 7)
            JOptionPane.showMessageDialog(null,
                                   "VII");
         
         if (numberWithinRange == 8)
            JOptionPane.showMessageDialog(null,
                                   "VIII");
         
         if (numberWithinRange == 9)
            JOptionPane.showMessageDialog(null,
                                   "IX");

         if (numberWithinRange == 10)
            JOptionPane.showMessageDialog(null,
                                   "X");

         System.exit(0);
      }
}