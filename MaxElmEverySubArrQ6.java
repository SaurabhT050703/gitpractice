/*
	6. Sliding Window Maximum
	Problem: Given an array of integers, find the maximum element in every subarray of size K.
	Example:
	arr = [1, 3, -1, -3, 5, 3, 6, 7], K = 3
	Output: [3, 3, 5, 5, 6, 7]
*/
import java.util.*;
public class  MaxElmEverySubArrQ6
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		int ar[]=new int[8];//{1,3,-1,-3,5,3,6,7};
		System.out.println("Enter The Array Elements:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter Sub array Length");
		int k=s.nextInt();
		int b[]=new int[ar.length-k+1];
		
		
		for(int i=0;i<=ar.length-k;i++)
		{
			int max=ar[i];
			for(int j=i;j<k+i;j++)
			{
				if(ar[j]>max)
				{
					max=ar[j];
					
				}
			}
			System.out.print(max+" ");
		}
		
	}
}