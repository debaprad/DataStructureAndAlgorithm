package sort;

public class InserStionSortTest {

	public void sort(int[] arr,int n)
	{
		for(int i=1;i<n;i++)
		{
			int insertedElement= arr[i];
			int j=i-1;
			for(;j>=0 && arr[j]>insertedElement;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=insertedElement;
		}
	}
}
