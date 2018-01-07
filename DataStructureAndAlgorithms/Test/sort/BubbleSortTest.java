package sort;

import algorithm.Util;

public class BubbleSortTest {

	public void sort(int[] arr,int n)
	{
		for(int i=n-2;i>=0;i--)
		{
			int swap=0;
			for(int j=0;j<=i;j++)
			{
				if(arr[j]>arr[j+1])
				Util.swap(arr, j, j+1);
				++swap;
			}
			if(swap==0)
			{
				return;
			}
		}
		
	}
}
