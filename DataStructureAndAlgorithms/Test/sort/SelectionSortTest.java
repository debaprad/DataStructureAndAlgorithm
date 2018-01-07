package sort;

import algorithm.Util;

public class SelectionSortTest {

	public void sort(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			int smallIndex=i;
			for(int j=i;j<n;j++)
			{
				if(arr[j]<arr[smallIndex])
				{
					smallIndex=j;
				}
			}
			if(arr[i]!=arr[smallIndex])
			{
				Util.swap(arr, i, smallIndex);
			}
		}
	}
}
