package MyPackage;

public class InsertionSorting
{
	public static void main(String[] args)
	{
		int[] a= {4,2,12,1,1};
		int c[]= insertionSorting(a);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}	

	}
	public static int[] insertionSorting(int[] a)
	{
		int i ,j;
		for( i=1;i<a.length;i++)
		{int temp=a[i];
			for( j=i;j>0 && temp<a[j-1];j--)
			{
				a[j]=a[j-1];
			}
			a[j]=temp;

		}
		return a;
	}
}