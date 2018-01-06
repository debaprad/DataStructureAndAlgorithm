package algorithm.sort;

public class SelectionSort {

	public void selectionSort(int[] arr,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int smallIndex = i;
			
			for(int j=i;j<n;j++)
			{
				if(arr[j] <= arr[smallIndex])
					smallIndex = j;
			}
			if(arr[i] != arr[smallIndex])
			{
				int temp = arr[i];
				arr[i] = arr[smallIndex];
				arr[smallIndex] = temp;
			}
			/*for(int value : arr)
			{
				System.out.print(value+",");
			}
			System.out.println();*/
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 13) + 1;
		}
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(arr,arr.length);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
		
	
	}
}
