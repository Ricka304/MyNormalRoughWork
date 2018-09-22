package MyPackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Flames
{


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First String:");
		String fs=sc.nextLine();
		System.out.println("Enter the Second String:");
		String str2=sc.nextLine();
		fs=fs.replace(" ", "").toLowerCase();		
		str2=str2.replace(" ", "").toLowerCase();
		System.out.println(fs);
		System.out.println(str2);
		HashMap<Character,Integer> hm=new HashMap<>();
		HashMap<Character,Integer> hm2=new HashMap<>();
		for(int i=0;i<fs.length();i++)
		{
			if(hm.get(fs.charAt(i))!=null)
			{
				hm.put(fs.charAt(i),hm.get(fs.charAt(i))+1);
			}
			else {
					hm.put(fs.charAt(i), 1);}
			
		}
		
		for(int i=0;i<str2.length();i++)
		{
			if(hm2.get(str2.charAt(i))!=null)
			{
				hm2.put(str2.charAt(i),hm2.get(str2.charAt(i))+1);
			}
			else {
					hm2.put(str2.charAt(i), 1);}
			
		
		}
		System.out.println(hm);
		System.out.println(hm2);
		int count=0;
for(Map.Entry<Character,Integer> entrySet:hm.entrySet()) 
{
	for(Map.Entry<Character,Integer> entrySet2:hm2.entrySet())
	{
		if(entrySet.getKey()==entrySet2.getKey())
		{
			//System.out.println(entrySet.getKey());
			//count=count+Math.abs(((entrySet.getValue()-entrySet2.getValue())));
			entrySet.setValue(Math.abs(((entrySet.getValue()-entrySet2.getValue()))));
			entrySet2.setValue(0);
			
		}
		
	//hm2.remove(entrySet2.getKey());
	}
}
	for(Integer a:hm.values())
	{
		//System.out.println(a);
		count=count+a.intValue();
		
	}
	for(Integer a:hm2.values())
	{count=count+a.intValue();
		
	
	
	
}
System.out.println(count);
		System.out.println(hm);
		System.out.println(hm2);
		System.out.println(calculateFlames(count));
		/*fs=fs.replace(" ", "");
		fs=fs.toLowerCase();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=1;i<fs.length();i++)
		{
			if(hm.get(fs.charAt(i))!=null)
			{
				hm.put(fs.charAt(i), hm.get(fs.charAt(i))+1);
			}
			else
			{
			hm.put(fs.charAt(i), 1);
		}}
		
		for(Map.Entry<Character,Integer> entrySet:hm.entrySet())
		{
			
		}
	
		*/
		
		
		//System.out.println(calculateFlames(14));

	}
		public static String calculateFlames(int count)
		{
			LinkedList<Object> list = new LinkedList<Object>();
			
			list.add("0");
			list.add("F");
			list.add("L");
			list.add("A");	
			list.add("M");
			list.add("E");
			list.add("S");
			
			for(int i=1;i<=5;i++)
			{
				System.out.println(list);
				list=removeElement(Integer.parseInt((String) list.get(0)),list.size()-1,count,list);
			}
			return (String) list.get(1);
		}
		
	public static  LinkedList<Object> removeElement(int startingCharacter,int stringLength,int count1,LinkedList<Object> list1)
	{
		int actualCount=0;
		actualCount=(count1)%stringLength;

		if(actualCount!=0)
		{
			list1.remove(actualCount);
			list1.set(0, Integer.toString(actualCount));

		}
		else
		{
			list1.remove(stringLength);
			list1.set(0, Integer.toString(actualCount));
		}
		for(int i=1;i<actualCount;i++)
		{
			list1.add((list1.size()),list1.get(i));
			
		}
		for(int i=1;i<actualCount;i++)
		{
			list1.remove(1);
		}
		return list1;
	}




}


/*
Sanjeev
Chethna
 */