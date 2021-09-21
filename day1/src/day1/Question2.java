package day1;
import java.util.*;

public class Question2
{
	public static void main(String[] args)
	{
//		Rs.100/pizza
//		Rs.20/puffs
//		Rs.10/cooldrink
		
		Scanner input = new Scanner(System.in);
		
		int pizzaPrice, puffsPrice, coolDrinksPrice, pizzaNum ,puffsNum, coolDrinksNum, total;
		System.out.print("Enter the no of pizzas bought: ");
		pizzaNum = input.nextInt();
		System.out.print("Enter the no of puffs bought: ");
		puffsNum = input.nextInt();
		System.out.print("Enter the no of cool drinks bought: ");
		coolDrinksNum = input.nextInt();
		System.out.println();
		
		pizzaPrice = pizzaNum * 100;
		puffsPrice = puffsNum * 20;
		coolDrinksPrice = coolDrinksNum * 10;
		total = pizzaPrice + puffsPrice + coolDrinksPrice;
		
		System.out.println("Bill Details");
		System.out.println("No of pizzas: " + pizzaNum);
		System.out.println("No of puffs: " + puffsNum);
		System.out.println("No of cooldrinks: " + coolDrinksNum);
		System.out.println("Total price = " + total);
		System.out.println("ENJOY THE SHOW!!!");
	}
}