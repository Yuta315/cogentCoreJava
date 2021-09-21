package day1;
import java.util.*;

public class Question3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,b,c,d;
		
		System.out.println("Enter the digits");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		char a1 = (char) a;
		char a2 = (char) b;
		char a3 = (char) c;
		char a4 = (char) d;
		System.out.println(a + "-" + a1);
		System.out.println(b + "-" + a2);
		System.out.println(c + "-" + a3);
		System.out.println(d + "-" + a4);
	}
}