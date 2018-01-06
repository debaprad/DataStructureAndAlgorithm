package algorithm.sort;

public class BubbleSort {

	public void bubbleSort(int[] arr,int n)
	{
		for(int i=n-2;i>=0;i--)
		{
			int swap = 0;
			for(int j=0; j<=i ;j++)
			{
					if(arr[j]>arr[j+1])
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						++ swap;
					}
			}
			/*System.out.println("swap "+swap);
			for(int value : arr)
			{
				System.out.print(value+",");
			}
			System.out.println();*/
			if(swap == 0)
			{
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 13) + 1;
		}
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(arr,arr.length);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
	}
}
