import java.util.*;

public class Question10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int sum = 0;
		System.out.print("Enter the car no: ");
		int num = input.nextInt();
		int originalNum = num;
		
		while(num != 0)
		{
			int remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}
		if (originalNum < 1000)
		{
			System.out.println(originalNum + " is not a valid car number");
		}
		else if ((sum % 3) == 0 || (sum % 5) == 0 || (sum % 7) == 0)
		{
			System.out.println("Lucky Number");
		}
		else
		{
			System.out.println("Sorry its not my lucky number");
		}
	}
}