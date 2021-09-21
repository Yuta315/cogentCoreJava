package day1;
import java.util.*;

public class Question5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int kClass = 75;
		int qClass = 150;
		int refreshment = 50;
		double cardDiscount = 0.02;
		double total;
		double SPDiscount = 0;
		
		System.out.print("Enter the no of ticket: ");
		int ticketNum = input.nextInt();
		if(ticketNum > 20)
		{
			SPDiscount = 0.1;
		}
		else
		{
			SPDiscount = 0;
		}

		if (ticketNum < 5 || ticketNum > 40)
		{
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
		else
		{
			System.out.print("Do you want refreshment: ");
			String ref = input2.nextLine();
			
			System.out.print("Do you have coupon code: ");
			String coupon = input2.nextLine();

			System.out.print("Enter the circle: ");
			String circle = input2.nextLine();
			
			if((!circle.equals("k")) && (!circle.equals("q")))
			{
				System.out.println("Invalid Input");
			}
			else
			{
				if(coupon.equals("y"))
				{
					if(circle.equals("k"))
					{
						if(ref.equals("y"))
						{
							total = (ticketNum * kClass) * (1 - (SPDiscount + cardDiscount));
//							total = (ticketNum * 75) * (1 - (0.1 + 0.02));
							System.out.println("Ticket cost: " + total);
							total = total + (ticketNum * refreshment);
							System.out.printf("Ticket cost: %.2f", total);
						}
						else
						{
							total = (ticketNum * kClass) * (1 - (SPDiscount + cardDiscount));
							System.out.printf("Ticket cost: %.2f", total);
						}
					}
					else if(circle.equals("q"))
					{
						if (ref.equals("y"))
						{
							total = (ticketNum * qClass) * (1 - (SPDiscount + cardDiscount));
							total = total + (ticketNum * refreshment);
							System.out.printf("Ticket cost: %.2f", total);
						}
						else
						{
							total = (ticketNum * qClass) * (1 - (SPDiscount + cardDiscount));
							System.out.printf("Ticket cost: %.2f", total);
						}
					}
				}
				else if (coupon.equals("n"))
				{
					if(circle.equals("k"))
					{
						if(ref.equals("y"))
						{
							total = ticketNum * kClass * (1 - SPDiscount);
							total = total + (ticketNum * refreshment);
							System.out.printf("Ticket cost: %.2f", total);
						}
						else
						{
							total = ticketNum * kClass * (1 - SPDiscount);
							System.out.printf("Ticket cost: %.2f", total);
						}
					}
					else if (circle.equals("q"))
					{
						if(ref.equals("y"))
						{
							total = ticketNum * qClass * (1 - SPDiscount);
							total = total + (ticketNum * refreshment);
							System.out.printf("Ticket cost: %.2f", total);
						}
						else
						{
							total = ticketNum * qClass * (1 - SPDiscount);
							System.out.printf("Ticket cost: %.2f", total);
						}
					}
				}
			}
		}




		
	}
}