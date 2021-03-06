package algorithm.sort;

public class InsertionSort {

	public void insertionSort(int[] arr,int n)
	{
		for(int i=1;i<n;i++)
		{
			int temp = arr[i];
			int j = i-1;
			for(; j>=0 && arr[j]>temp ; j--)
			{
				arr[j+1] = arr[j];
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 13) + 1;
		}
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(arr,arr.length);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
	}

}
