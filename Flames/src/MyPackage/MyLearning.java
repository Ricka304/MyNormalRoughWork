package MyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class MyLearning
{
public static void main(String args[]) throws IOException

{
/*InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(is);
String sc=br.readLine();
System.out.println(sc);*/
	 Scanner scn = new Scanner(System.in); 
     System.out.println("Enter the Statement");
	 String sc= scn.nextLine();
	 	String[] strlist=sc.split(" ");
	 	LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
	 	for(String sp:strlist)
	 	{
	 		if(hm.get(sp)!=null)
	 		{
	 			hm.put(sp, hm.get(sp)+1);
	 		}
	 		else
	 		{
	 		hm.put(sp, 1);
	 	}
	 	}
	 	System.out.println(hm);
	 	
for(Map.Entry<String,Integer> entryset:hm.entrySet())
	if(entryset.getValue()>1)
	{
		System.out.println(entryset.getValue() + " is the value for the key "+entryset.getKey());
}
	
	}
}
