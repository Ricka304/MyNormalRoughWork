package MyPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class MyLearning4
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
	
	
	
	FileInputStream fos =new FileInputStream("Random5.txt");
	ObjectInputStream oos =new ObjectInputStream(fos);
	Save s=(Save) oos.readObject();
	System.out.println(s.i);
	
	}
}
 class Save implements Serializable
{
	 int i;
	}