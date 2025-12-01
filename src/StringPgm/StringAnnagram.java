package StringPgm;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnnagram {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string");
String s1=sc.nextLine();	
System.out.println("Enter second string");
String s2=sc.nextLine();		
if(s1.length()==s2.length())
{
	char[] ch1=s1.toLowerCase().toCharArray();
	char[] ch2=s2.toLowerCase().toCharArray();

	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1, ch2))
	{
		System.out.println( s1+ " and " +s2+ " is a annagram");
	}
	else
		System.out.println(s1+ "and" +s2+ "is not a annagram");
}
else
	System.out.println(s1+ "and" +s2+ "is not having same length");
}
}
