package day1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// leap year : %4 or 100 and 400
		Scanner input = new Scanner(System.in);
		
//		int year = input.nextInt();
		boolean leap = false;
		/*
		 * if (year %4 == 0) { if (year %100 == 0) { if (year %400 == 0) { leap = true;
		 * } else leap = false; } } else { leap = false; } if (leap = true) {
		 * System.out.println(year + " is leap year"); } else { System.out.println(year
		 * + " is not leap year"); }
		 */
		
//		if((year %4 == 0 && year %100 != 0)||year %400 == 0)
		{
//			System.out.println(year + " is not leap year");
		}
		/*
		 * else if(year %4 == 0 && year %100!= 0 && year %400 == 0) {
		 * System.out.println(year + " is leap year"); } else { System.out.println(year
		 * + " is not leap year"); }
		 */
		
//		int strongNum = input.nextInt();

		
//		System.out.println("Hello ");
//		System.out.println("Hello from cogent");
//		System.out.println("Hello from Yuta");
		
		int number = 145;
		int digit = 0;
		int factorial = 1;
		int sum = 0;
		
		int temp = number;
		while(number > 0)
		{
			digit = number %10;
			// 145 % 10 = 5
			System.out.println(digit);
			number /= 10; // short hand notation.
			// number = number/10
			for (int i = 1; i <= digit; i++)
			{
				factorial *= i;
			}
			System.out.println(factorial);
			sum += factorial;
			factorial = 1;
		}
		System.out.println(sum == temp);
		System.out.println(number);		
//		for(int i = 0; i < number; i ++)
//		{
//			factorial = factorial*i;
//			sum += factorial;
//		}
//		number = number / 10;
		
	
    	int num2 = 95;
//		boolean test = false;
//    	if((num2 %2 == 0) && (num2 %7 == 0))
//    	{
//    		test = true;
//    		System.out.println(test);
//    	}
//    	else
//    		System.out.println(test);
    	for (int i = 1; i <= 100; i++)
    	{
    		if((i %2 == 0) && (i %7 == 0))
    		{
        		System.out.println(i);
    		}
    	}
    	
		
		System.out.print("Input number please : ");
        int num = input.nextInt();

        if (isPerfectNumber(num))
        {
        	System.out.println(num + " is a perfect number.");
        }
        else
        {
            System.out.println(num + " is not a perfect number.");
        }
	}

    	static boolean isPerfectNumber(int num)
    	{
    		int sum = 0;
    		for (int i = 1; i <= num / 2; i++)
    		{
    			if (num % i == 0)
    			{
    				sum += i;
    			}
    		}
    		return sum == num;
    	}
}
