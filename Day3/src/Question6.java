import java.util.*;

public class Question6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month: ");
		int month = input.nextInt();
		
		if((month == 3) || (month == 4) || (month == 5))
		{
			System.out.println("Season: Spring");
		}
		else if ((month == 6) || (month == 7) || (month == 8))
		{
			System.out.println("Season: Summer");
		}
		else if ((month == 9) || (month == 10) || (month == 11))
		{
			System.out.println("Season: Autumn");
		}
		else if ((month == 12) || (month == 1) || (month == 2))
		{
			System.out.println("Season: Winter");
		}
		else
		{
			System.out.println("Invalid month");
		}
	}
}