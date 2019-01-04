import java.util.Scanner;

public class Chapter3Problem15
{
	public static void main (String[] args)
	{
		double bankBaseFee = 10.0;
		double lessThan20Checks = 0.10;
		double between20And39Checks = 0.08;
		double between40And59Checks = 0.06;
		double total60OrMoreChecks = 0.04;
		double userNumberOfChecks;
		double lessThank20ChecksTotal;
		double between20And39ChecksTotal;
		double between40And59ChecksTotal;
		double total60OrMoreChecksTotal;

		Scanner keyboard = new Scanner (System.in);

		System.out.println("How many checks did you write this month?");
		userNumberOfChecks = keyboard.nextDouble();

		lessThank20ChecksTotal = bankBaseFee + (userNumberOfChecks * lessThan20Checks);
		between20And39ChecksTotal = bankBaseFee + (userNumberOfChecks * between20And39Checks);
		between40And59ChecksTotal = bankBaseFee + (userNumberOfChecks * between40And59Checks);
		total60OrMoreChecksTotal = bankBaseFee + (userNumberOfChecks * total60OrMoreChecks);

		if(userNumberOfChecks < 20.0)
		{
			System.out.println("Your fees for the month are: $" + lessThank20ChecksTotal);
		}

		else if(userNumberOfChecks >= 20.0 && userNumberOfChecks <= 39.0)
		{
			System.out.println("Your fees for the month are: " + between20And39ChecksTotal);
		}

		else if(userNumberOfChecks >= 40.0 && userNumberOfChecks <= 59.0)
		{
			System.out.println("Your fees for the month are: " + between40And59ChecksTotal);
		}

		else if(userNumberOfChecks >= 60.0)
		{
			System.out.println("Your fees for the month are: " + total60OrMoreChecksTotal);
		}
	}	
}