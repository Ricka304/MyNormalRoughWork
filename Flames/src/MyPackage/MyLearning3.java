package MyPackage;

import java.util.HashMap;
import java.util.Scanner;

//8.19
public class MyLearning3
{
	public static void main(String[] args)
	{
		int n=3;
		String[] Str=new String[n];
		String[][] str2=new String[n][];
		HashMap<String,Integer> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			
			
			Str  =sc.nextLine().split("\\*");
			if(hm.get(Str[0])!=null)
			{
				hm.put(Str[0], hm.get(Str[0])+1);
			}
			else
			{
			hm.put(Str[0],1);
			}
			for(int j=1;j<Str.length;j++)
			{
				System.out.println(Str[0]+"_"+hm.get(Str[0])+"_"+j+"_"+Str[j]);
			}
			
		}
		
	
		
	}
	}