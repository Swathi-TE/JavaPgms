package StringPgm;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
	String s=sc.nextLine();
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
	char ch=s.charAt(i);
rev+=ch;
	}
	if(s.equalsIgnoreCase(rev))
	{
		System.out.println("String is a palindrome");
	}
	else
		System.out.println("String is not a palindrome");
	}
}
