package StringPgm;

import java.util.Scanner;

public class RevStringWithoutExtraVar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
String s=sc.nextLine();
for(int i=s.length()-1;i>=0;i--)
{
char ch=s.charAt(i);
System.out.println(ch);
}
}
}
