import java.util.*;

public class Question7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int min = input.nextInt();
		int max = input.nextInt();
		
		int i,j;
		i = min;
		if((min > max) || ((min < 0) || (max < 0)))
		{
			System.out.println("Provide valid input");
		}
		else
		{
			while(i < max)
			{
	        	for(j = i / 2; i % j != 0; j --);
	            if (j == 1)
	            {
	            	System.out.print(i + " ");
	            }
	            i++;
			}
		}

        
	}
}