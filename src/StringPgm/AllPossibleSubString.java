package StringPgm;

import java.util.Scanner;

public class AllPossibleSubString {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
String s=sc.nextLine();
String s3 = "";
for(int i=0;i<s.length();i++)
{
	for(int j=i+1;j<s.length();j++)
	{
		String s1=s.substring(i, j);
        String s2=new StringBuilder(s1).reverse().toString();
        int length = 0;
		if(s1.equals(s2)&&length<s1.length())
        {
			length=s1.length();
			 s3 = s1;
        }
	}
	System.out.println(s3);
}
	}
}
