package MyPackage;

public class SelectionSorting
{
public static void main(String[] args)

{
	int d[]= {5,7,2465,4,6,100};
	int c[]=selectionSorting(d);
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]+" ");
	}
}
public static int[] selectionSorting(int[] c)
{
	int temp;
	for(int i=0;i<c.length;i++)
	{
		for( int j=i+1;j<c.length;j++)
		{
			//System.out.println("normal values"+ c[i]+ " "+c[j]);
			
			if(c[i]>c[j])
			{
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				//System.out.println("replaced vaues"+ c[i]+ " "+c[j]);
			}
		}
	}
	return c;
	}
}
