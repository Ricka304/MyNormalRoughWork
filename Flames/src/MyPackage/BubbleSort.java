package MyPackage;

public class BubbleSort
{
public static void main(String[] args)

{
	int d[]= {8005,7,2465,4,8,2};
	int e[]= {5,4,6,8,16,100};
	int c[]=BubbleSorting(d);
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]+" ");
	}
}
public static int[] BubbleSorting(int[] c)
{
	int temp;
	int flag=0;
	for(int j=c.length-1;j>0;j--)
	{
		//System.out.println(j);
	for(int i=0;i<j;i++)
	{
		//System.out.println(c[i]+" "+c[i+1]);
		if(c[i]>c[i+1])
		{
			temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
			flag=1;			
		}
		
		
		//System.out.println(c[i]+" "+c[i+1]);
	}
	//System.out.println(flag);
	if(flag==0)
	{
		break;
	}
	}
	return c;
	}
}
