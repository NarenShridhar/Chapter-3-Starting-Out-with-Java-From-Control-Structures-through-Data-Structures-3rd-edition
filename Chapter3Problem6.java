// Chapter 3 Page 185
// Programming Challenges #6

import javax.swing.JOptionPane;

public class Chapter3Problem6
{
   public static void main(String[] args)
   {
      int secondsEntered;
      int secondsEnteredInMinutes;
      int secondsEnteredInHours;
      int secondsEnteredInDays;
      String input;
      
      input = JOptionPane.showInputDialog("enter a number of seconds");
      secondsEntered = Integer.parseInt(input);
      
      secondsEnteredInMinutes = secondsEntered/60;
      
      secondsEnteredInHours = secondsEntered/3600;
      
      secondsEnteredInDays = secondsEntered/86400;
      
      if (secondsEntered < 3600)
         JOptionPane.showMessageDialog(null,
                                "The seconds in minutes are: "
                                 + secondsEnteredInMinutes);
                                 
      if (secondsEntered >= 3600 && secondsEntered < 86400)
         JOptionPane.showMessageDialog(null,
                                "The seconds in hours are: "
                                + secondsEnteredInHours);
                                
      if (secondsEntered >= 86400)
         JOptionPane.showMessageDialog(null,
                                "The seconds in days are: "
                                + secondsEnteredInDays);
      
      System.exit(0);
   }
}
