package MyPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyLearning2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		LinkedHashMap<Character,Integer> hm= new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.get(str.charAt(i))!=null)
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			}
			else
			{
			hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
		for(Map.Entry<Character, Integer> entryset :hm.entrySet())
		{
			System.out.println(entryset.getKey()+" "+entryset.getValue());
		}
	}
	}