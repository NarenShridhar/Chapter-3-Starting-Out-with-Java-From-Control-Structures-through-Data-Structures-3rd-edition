// Chapter 3 Page 184-5
// Programming Challenges #2

import javax.swing.JOptionPane;

public class Chapter3Problem2
{
   public static void main(String[] args)
   {
      int month;
      int day;
      int twoDigitYear;
      String input;
      
      input = JOptionPane.showInputDialog("Enter in numeric form, a month");
      month = Integer.parseInt(input);
      
      input = JOptionPane.showInputDialog("Enter in numeric form, a day");
      day = Integer.parseInt(input);
      
      input = JOptionPane.showInputDialog("Enter in numeric form, a two digit year");
      twoDigitYear = Integer.parseInt(input);
      
      if ((month*day) == twoDigitYear)
      {
         JOptionPane.showMessageDialog(null,
                                "The date is Magic!");
      }
      else 
      {
         JOptionPane.showMessageDialog(null,
                                "The date is NOT magic :(");
      }
      
      System.exit(0);
   }
}