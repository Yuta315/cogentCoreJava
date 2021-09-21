package day1;
import java.util.*;

public class Question1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
//		US approach of fuel consumption calculation (distance / fuel)
//      European approach (fuel / distance )
//      1 kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons
		
//		float cost = 670.23;
//		double cos = 670.23;

//		float cost = (float) cos;
//		System.out.printf("You need a sum of Rs.%.2f to cover the trip",cost);
		
		System.out.print("Enter the no of liters to fill the tank: ");
		int liters = input.nextInt();
		if(liters <= 0)
		{
			System.out.println(liters + " is an Invalid Input");
		}
		else
		{
			System.out.print("Enter the distance covered: ");
			int distance = input.nextInt();
			if(distance <= 0)
			{
				System.out.println(distance + " is an Invalid Input");
			}
			else
			{
//				For 150 KM fuel consumption is 20 liters then 100 KM fuel consumption
				double FinalKMConsumption = ((double) liters / (double) distance) * 100;
//				System.out.println(FinalKMConsumption);
				System.out.printf("Liters/100KM: %.2f\n", FinalKMConsumption);
				double convertToMiles = (double) distance * 0.6214;
//				System.out.println(covertToMiles);
				double convertToGallons = (double) liters * 0.2642;
				double FuelConsumption = convertToMiles / convertToGallons;
				System.out.printf("Miles/Gallons: %.2f\n", FuelConsumption);
			}
		}
	}
}