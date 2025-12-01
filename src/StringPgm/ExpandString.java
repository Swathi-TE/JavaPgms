package StringPgm;

import java.util.Scanner;

public class ExpandString {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
String s=sc.nextLine();
for(int i=0;i<s.length();i=i+2)
{
	int count=s.charAt(i+1)-48;
	char ch=s.charAt(i);
	for(int j=1;j<count;j++)
	{
		System.out.println(ch);
	}
	}
	}
}
