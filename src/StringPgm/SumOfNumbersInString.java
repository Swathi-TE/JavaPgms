package StringPgm;

import java.util.Scanner;

public class SumOfNumbersInString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
	String s=sc.nextLine();	
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='0'&&ch<='9')
		{
			sum=sum+ch-48;
		}
		
	}
	System.out.println(sum);
	}
}
