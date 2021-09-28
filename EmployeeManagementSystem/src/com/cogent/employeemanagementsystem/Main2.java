package com.cogent.employeemanagementsystem;

public class Main2 {

	public static void main(String[] args)
	{

//		String s = "Yuta";
//		String s2 = "cogent";
//		String s3 = new String("cogent university");
//		CN ref = RT allocation
		
//		String s4 = "Yuta";
//		String s5 = "cogent";
		
//		System.out.println(s4.concat(" " + s5));
//		concate is the only one solution where we can get new object
//		System.out.println(s4);
//		because string objects are immuble.
		
//		at least 3 - 4 methods except concat
//		toUpperCase, to LowerCase(), valueOf
//		rlpace?/
//		which are returning new String objects?
		
//		String s1="hello string";  
//		String s1upper=s1.toUpperCase();  
//		System.out.println(s1upper);
		
//		String s1="JAVA HELLO stRIng";  
//		String s1lower=s1.toLowerCase();  
//		System.out.println(s1lower);  
		
//		int value=30;  
//		String s1=String.valueOf(value);  
//		System.out.println(s1+10);//concatenating string with 10 
		
//		String myStr = "Hello";
//		System.out.println(myStr.replace('l', 'p'));
		
		
//		try {
	//		ip: 192.168.1.1
//			String ip = "192.168.1.1";
	//		A B C D E
	//		do we need to split this ip address on the basis of .?
	//		0 to 255
			
//			String [] ipAddress = ip.split("\\.");
	//		\\.
	//		\\ ==> \.
	//		\. is escape sequence.
	//		"\\" ===> \ in String
//			for (String string : ipAddress)
//			{
	//			System.out.println(Integer.parseInt(string));
//				int a = Integer.parseInt(string);
//				if((a >= 0) && (a <= 255))
//				{
					
//				}
//				else
//					System.exit(0);
	//				return;
//			}
	//	    System.out.print("String Length :" );
	//	    System.out.println(ip.length());
			
//			int classCell = Integer.parseInt(ipAddress[0]);
//			int classCell = Integer.parseInt("abc");
			
//			if((classCell > 0) && (classCell <= 127))
//			{
//				System.out.println("IP belongs to class A");
//			}
//			else if((classCell >= 128) && (classCell <= 191))
//			{
//				System.out.println("IP belongs to class B");
//			}
//			else if((classCell > 192) && (classCell <= 223))
//			{
//				System.out.println("IP belongs to class C");
//			}
//			else if((classCell > 224) && (classCell <= 239))
//			{
//				System.out.println("IP belongs to class D");
//			}
//			else
//			{
//				System.out.println("IP is not valid.");
//			}
//		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		String s = "Cogent university";
		
//		System.out.println(s.length());
//		length method: string class
//		length property is : array
		
		
//		int a = 10;
//		int c = 10;
		
//		System.out.println(a == c); // True
		
//		String result = s.substring(0,6);
//		System.out.println(result);
		
//		System.out.println(s.equals("Cogent university")); // True
//		System.out.println(s == new String ("Cogent university")); // False because this make new ref
//		it is used to check that whether s and other ref is referring to same object or not.
		
//		equals method used to check the content
//		== operator is used to check location in case of ref
//		in case of primitive ==> value would be the expectation.
		
//		System.out.println("yuta".codePointAt(0));
//		System.out.println("YUTA".codePointAt(0));
//		System.out.println("cogent".compareTo("Yuta"));
//		System.out.println("y".compareTo("y"));
//		System.out.println("u".compareTo("T"));
		
		
		StringBuffer buffer = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
//		DC: by default it is capable to hold 16 chars.
//		capacity has 16 first but after two there is multiply that number + 2 if there is empty ()
//		if number is inside of () then capacity will be same as inside of () number.
		
//		System.out.println(buffer.capacity());
//		buffer.append("YutaMogi");
//		8
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
//		buffer.append("Yuta315");
//		7 chars
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
		
//		buffer.append(" ");
//		1 chars
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
		
//		buffer.append("a");
//		1 chars
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
		
//		buffer.delete(0, 5); // delete 0 to 5 area so for the alphabet it will delete A to E
//		buffer.compareTo(buffer);
		
//		System.out.println(buffer);
		
		System.out.println(10>>1);
	}
}
