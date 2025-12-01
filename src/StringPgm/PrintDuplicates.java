package StringPgm;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintDuplicates {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
String s=sc.nextLine();
LinkedHashMap<Character, Integer> hash=new LinkedHashMap<Character, Integer>();
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(hash.containsKey(ch))
	{
		hash.put(ch, hash.get(ch)+1);
	}
	else
		hash.put(ch, 1);
}
for(Entry<Character, Integer> map:hash.entrySet())
{
if(map.getValue()>1)
{
	System.out.println(map.getKey());
}
}
}
}
