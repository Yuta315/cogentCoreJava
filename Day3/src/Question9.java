import java.util.*;


public class Question9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Enter the salary: ");
		double salary = input.nextDouble();
		System.out.print("Enter the Performance appraisal rating: ");
		double rating = input.nextDouble();
		
		if((salary <= 0) || ((rating < 1) && (rating > 5)))
		{
			System.out.println("Invalid Input");
		}
		else
		{
			if((rating >= 1) && (rating <= 3))
			{
				salary = salary * (1 + 0.1);
				System.out.println(Math.round(salary));
			}
			else if((rating >= 3.1) && (rating <= 4))
			{
				salary = salary * (1 + 0.25);
				System.out.println(Math.round(salary));
			}
			else if((rating >= 4.1) && (rating <= 5))
			{
				salary = salary * (1 + 0.3);
				System.out.println(Math.round(salary));
			}
		}
	}
}