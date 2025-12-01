package StringPgm;

import java.util.Scanner;

public class NoOfAplhaScDigits {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
	String s=sc.nextLine();	
	int alphaCount=0;
	int digiCount=0;
	int ScCount=0;
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='0' && ch<='9')
		{
			digiCount++;
		}
		else if(ch>='a' &&ch<='z' || ch>='A' && ch<='Z')
		{
			alphaCount++;
		}
		else
			ScCount++;
	}
	System.out.println(digiCount);
	System.out.println(alphaCount);
	System.out.println(ScCount);

	}
}
