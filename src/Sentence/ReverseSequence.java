package Sentence;

import java.util.Scanner;

public class ReverseSequence {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a sentence");
	String s=sc.next();
	String[] str=s.split("");
	for(int i=0;i<str.length-1;i++)
	{
		System.out.println(str[i]+ " ");
	}
	}
}
