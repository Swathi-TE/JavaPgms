package StringPgm;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
String s=sc.nextLine();	
LinkedHashSet set=new LinkedHashSet();
for(int i=0;i<s.length();i++)
{
	set.add(s.charAt(i));
}
System.out.println(set);
}
}
