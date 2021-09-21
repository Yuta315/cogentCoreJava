package day1;
import java.util.*;

public class Question4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int CSE, ECE, MECH;
		System.out.print("Enter the no of students placed in CSE: ");
		CSE = input.nextInt();
		System.out.print("Enter the no of students placed in ECE: ");
		ECE = input.nextInt();
		System.out.print("Enter the no of students placed in MECH: ");		
		MECH = input.nextInt();
		if(CSE < 0 || ECE < 0 || MECH < 0)
		{
			System.out.println("Input is Invalid");
		}
		else if ((CSE == ECE) && (ECE == MECH))
		{
			System.out.println("None of the department has got the highest placement");
		}
		else
		{
			if((CSE > ECE) && (CSE > MECH))
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
			}
			else if ((ECE > CSE) && (ECE > MECH))
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
			}
			else if ((MECH > CSE) && (MECH > ECE))
			{
				System.out.println("Highest placement");
				System.out.println("MECH");
			}
			else
			{
				if((CSE == ECE) || (CSE == MECH))
				{
					if(CSE > MECH)
					{
						System.out.println("Highest placement");
						System.out.println("CSE");
						System.out.println("ECE");
					}
					else if(CSE > ECE)
					{
						System.out.println("Highest placement");
						System.out.println("CSE");
						System.out.println("MECH");
					}
					else if (CSE < MECH)
					{
						System.out.println("Highest placement");
						System.out.println("MECH");
					}
					else if (CSE < ECE)
					{
						System.out.println("Highest placement");
						System.out.println("ECE");
					}
				}
				else if (ECE == MECH)
				{
					if(CSE > ECE)
					{
						System.out.println("Highest placement");
						System.out.println("CSE");
					}
					else if (CSE < ECE)
					{
						System.out.println("Highest placement");
						System.out.println("ECE");
						System.out.println("MECH");
					}
				}
			}
		}
	}
}