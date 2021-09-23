import java.util.*;

public class Question8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int originalNum = num;
		int reverse = 0;
		
		while(num != 0)
		{
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		
		if (originalNum == reverse)
		{
			System.out.println("Palindrome");
		}
		else if (originalNum != reverse)
		{
			System.out.println("Not a Palindrome");
		}
	}
}