import java.util.Scanner;

public class Chapter3Problem16
{
	public static void main (String[] args)
	{
		final int zero_Books_Purchased_Points_Total = 0;
		final int one_Book_Purchased_Points_Total = 5;
		final int two_Books_Purchased_Points_Total = 15;
		final int three_Books_Purchased_Points_Total = 30;
		final int four_Or_More_Books_Purchased_Points_Total = 60;
		int userBooksPurchaed;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the amount of books you purchased this month: ");
		userBooksPurchaed = keyboard.nextInt();

		if(userBooksPurchaed == 0)
		{
			System.out.println("Your points total for the month is: " + zero_Books_Purchased_Points_Total);
		}

		else if(userBooksPurchaed == 1)
		{
			System.out.println("Your points total for the month is: " + one_Book_Purchased_Points_Total);
		}

		else if(userBooksPurchaed == 2)
		{
			System.out.println("Your points total for the month is: " + two_Books_Purchased_Points_Total);
		}

		else if(userBooksPurchaed == 3)
		{
			System.out.println("Your points total for the month is: " + three_Books_Purchased_Points_Total);
		}

		else if(userBooksPurchaed >= 4)
		{
			System.out.println("Your points total for the month is: " + four_Or_More_Books_Purchased_Points_Total);
		}
	}
}