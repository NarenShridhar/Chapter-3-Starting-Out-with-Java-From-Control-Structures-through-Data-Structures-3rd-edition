import java.util.Scanner;

public class Chapter3Problem13
{
	public static void main (String[] args)
	{
		final double package_A_Base_Cost = 9.95;
		final double package_A_Hours_In_BaseCost = 10.0;
		final double package_A_Additional_Hours_Cost_Per_Hour = 2.00;
		final double package_B_Base_Cost = 13.95;
		final double package_B_Hours_In_Base_Cost = 20.0;
		final double package_B_Additional_Hours_Cost_Per_Hour = 1.00;
		final double package_C_Base_Cost = 19.95;
		double userHours;
		double hoursExceeded = 0;
		double extraCharge = 0;
		double totalBill = 0;

		Scanner keyboard = new Scanner(System.in);

		String userPackage;

		System.out.println("Enter the package you purchased, 'A', 'B', or 'C': ");
		userPackage = keyboard.nextLine();

		System.out.println("Enter the amount of hours you used the internet for: ");
		userHours = keyboard.nextDouble();

		if (userPackage.equalsIgnoreCase("a"))
		{
			if (userHours > package_A_Hours_In_BaseCost)
			{
				hoursExceeded = userHours - package_A_Hours_In_BaseCost;
				extraCharge = hoursExceeded * package_A_Additional_Hours_Cost_Per_Hour;
			}

			totalBill = package_A_Base_Cost + extraCharge;
		}

		else if (userPackage.equalsIgnoreCase("b"))
		{
			if (userHours > package_B_Hours_In_Base_Cost)
			{
				hoursExceeded = userHours - package_B_Hours_In_Base_Cost;
				extraCharge = hoursExceeded * package_B_Additional_Hours_Cost_Per_Hour;
			}

			totalBill = package_B_Base_Cost + extraCharge;
		}

		else if (userPackage.equalsIgnoreCase("c"))
		{
			totalBill = package_C_Base_Cost;
		}

		System.out.println("Your total bill was: " + totalBill);
	}
}