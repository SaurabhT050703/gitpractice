/*
	Find Common Elements in Two Arrays
	Create a program that finds and prints common elements in two arrays.
	Example: Array 1: [1, 2, 3, 4], Array 2: [3, 4, 5, 6] → Common: [3, 4]
*/
import java.util.*;
public class FindCommonElmArQ10
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("Enter First Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[4];
		System.out.println("Enter Second Array Elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		if(a.length==b.length)
		{
			System.out.print("Common elements Is:");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						System.out.print(a[i]+" ");
						
					}
				}
			}
		}
		else{
		System.out.println(" Array lengh is not equal");	
		}
	}
}