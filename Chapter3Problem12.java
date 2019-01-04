import java.util.Scanner;

public class Chapter3Problem12
{
	public static void main (String[] args)
	{
		double speedOfSoundInAir = 1100;
		double speedOfSoundInWater = 4900;
		double speedOfSoundInSteel = 16400;
		double timeTraveledByAir;
		double timeTraveledByWater;
		double timeTraveledBySteel;
		String userSelectedElement;
		double userDistance;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter 'air', 'water', or 'steel': ");
		userSelectedElement = keyboard.nextLine();

		System.out.println("Enter how many feet the wave traveled for: ");
		userDistance = keyboard.nextDouble();

		timeTraveledByAir = userDistance/1100.0;
		timeTraveledByWater = userDistance/4900.0;
		timeTraveledBySteel = userDistance/16400;

		if (userSelectedElement.equalsIgnoreCase("air"))
		{
			System.out.println("The sound wave traveled for: " + timeTraveledByAir + " seconds");
		}

		if (userSelectedElement.equalsIgnoreCase("water"))
		{
			System.out.println("The sound wave traveled for: " + timeTraveledByWater + " seconds");
		}

		if (userSelectedElement.equalsIgnoreCase("steel"))
		{
			System.out.println("The sound wave traveled for: " + timeTraveledBySteel + "seconds");
		}
	}
}