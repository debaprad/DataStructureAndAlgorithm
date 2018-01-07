package algorithm.sort;

public class MergSort {

	public void merg(int[] arr1,int[] arr2,int[] temp,int n1, int n2)
	{
		int i=0,j=0,k=0;
		
		
		while(i<n1 && j<n2)
		{
			if(arr1[i] < arr2[j])
			{
				temp[k++] = arr1[i++];
			}
			else
			{
				temp[k++] = arr2[j++];
			}
		}
		
		while(i < n1)
		{
			temp[k++] = arr1[i++];
		}
		
		while(j < n2)
		{
			temp[k++] = arr2[j++];
		}
	}
	
	public void merg(int[] arr,int[] temp,int leftLow, int leftUp,int rightLow,int rightUp)
	{
		int i=leftLow,j=rightLow,k=leftLow;
		
		while(i<leftUp && j<rightUp)
		{
			if(arr[i] <= arr[j])
			{
				temp[k++] = arr[i++];
			}
			else
			{
				temp[k++] = arr[j++];
			}
		}
		while(i<leftUp)
		{
			temp[k++] =arr[i++];
		}
		
		while(j<rightUp)
		{
			temp[k++] =arr[j++];
		}
	}
	
	public void mergSort(int[] arr,int[] temp,int low,int up)
	{
		if(low==up)
		{
			return;
		}
		int midd = (low+up)/2;
		mergSort(arr, temp, low,midd);
		mergSort(arr, temp, midd+1,up);
		merg(arr, temp, low, midd, midd+1, up);
		copy(arr,temp,low,up);
	}
	
	private void copy(int[] arr,int[] temp,int low,int high)
	{
		for (int i = low; i < high; i++) {
			arr[i] = temp[i];
		}
	}
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[3];
		int[] temp = new int[arr1.length + arr2.length];
		arr1[0] = 3;
		arr1[1] = 4;
		arr1[2] = 5;
		arr1[3] = 6;
		arr1[4] = 7;
		
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 9;
		
		int[] arr = new int[arr1.length + arr2.length];
		
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 33;
		arr[3] = 6;
		arr[4] = 7;
		arr[5] = 55;
		arr[6] = 2;
		arr[7] = 22;
		MergSort mergSort = new MergSort();
		mergSort.mergSort(arr, temp, 0, arr.length);
		//mergSort.merg(arr, temp,0,5,5,8);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
		
	
	}
}
