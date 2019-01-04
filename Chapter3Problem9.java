import java.util.Scanner;

public class Chapter3Problem9
{
	public static void main (String[] args)
	{
		byte weightOfPackage;
		final double costPer500MilesShipped2LbsOrLess = 1.10;
		final double costPer500MilesShipped2LbsTo6Lbs = 2.20;
		final double costPer500MilesShipped6Lbsto10Lbs = 3.70;
		final double costPer500MilesShippedOver10Lbs = 3.80;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the weight of the package?");
		weightOfPackage = keyboard.nextByte();

		if(weightOfPackage <= 2.0)
		{
			System.out.println("The cost for a package weighing " + weightOfPackage + " pounds is: $" + costPer500MilesShipped2LbsOrLess);
		}

		if(weightOfPackage > 2.0 && weightOfPackage <= 6.0)
		{
			System.out.println("The cost for a package weighing " + weightOfPackage + " pounds is: $" + costPer500MilesShipped2LbsTo6Lbs);
		}

		if(weightOfPackage > 6.0 && weightOfPackage <= 10.0)
		{
			System.out.println("The cost for a package weighing " + weightOfPackage + " pounds is: $" + costPer500MilesShipped6Lbsto10Lbs);
		}

		if(weightOfPackage > 10.0)
		{
			System.out.println("The cost for a package weighing " + weightOfPackage + " pounds is: $" + costPer500MilesShippedOver10Lbs);
		}
	}
}