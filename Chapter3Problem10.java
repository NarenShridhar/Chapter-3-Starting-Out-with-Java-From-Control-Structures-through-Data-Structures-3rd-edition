import java.util.Scanner;

public class Chapter3Problem10
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double numberOfCalories;
		double fatGrams;
		double caloriesFromFat;
		double percentageOfCaloriesFromFat;

		System.out.println("Enter the number of total calories: ");
		numberOfCalories = keyboard.nextDouble();

		System.out.println("Enter the number of fat grams: ");
		fatGrams = keyboard.nextDouble();

		caloriesFromFat = fatGrams * 9.0;

		percentageOfCaloriesFromFat = caloriesFromFat / numberOfCalories;

		if(caloriesFromFat > numberOfCalories)
		{
			System.out.println("It is impossible that the number of calories from fat is greater than the total number of calories. Invalid Input.");
		}

			else
			{
				if(caloriesFromFat < (30.0/100.0) * numberOfCalories)
					{
						System.out.println("This food is low in fat!");
					}

				System.out.println("The percentage of calories that come from fat is: " + percentageOfCaloriesFromFat);	
			}	
	}
}