/*
	7. Merge Two Arrays
	Implement a program that merges two arrays into one.
	Example: Array 1: [1, 2, 3], Array 2: [4, 5, 6] → Merged: [1, 2, 3, 4, 5, 6]
*/
import java.util.*;
public class MergeTwoArrQ7
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[3];
		
		
		System.out.println("Enter First Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[3];
		System.out.println("Enter second Array Elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];	
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}