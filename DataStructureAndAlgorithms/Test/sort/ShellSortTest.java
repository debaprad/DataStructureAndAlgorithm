package sort;

public class ShellSortTest {

	public void sort(int[] arr,int n)
	{
		int devider = 5;
		while(devider>=1)
		{
			for(int i=devider;i<n;i++)
			{
				int insertedElement= arr[i];
				int j= i-devider;
				for(; j>=0 && arr[j] > insertedElement ; j=j-devider)
				{
					arr[j+devider]=arr[j];
				}
				arr[j+devider]=insertedElement;
			}
			devider=devider-2;
		}
	}
}
