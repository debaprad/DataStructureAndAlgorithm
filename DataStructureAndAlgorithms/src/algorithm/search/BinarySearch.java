package algorithm.search;

import algorithm.sort.SelectionSort;
import datastructur.BinaryTreeTest;

public class BinarySearch {

	public int search(int[] arr,int n,int val)
	{
		int first=0,last=n-1,midd=0;
		while(first<=last)
		{
			midd=(first+last)/2;
		   if(val>arr[midd])
			{
				first = midd+1;
			}
		   else if(val<arr[midd])
			{
				last =  midd-1;
			}
			
			else{
				return midd;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		BinarySearch binarySearch= new BinarySearch();
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 13) + 1;
		}
		for(int value : arr)
		{
			System.out.print(value+",");
		}
		int x=arr[3];
		SelectionSort selectionSort =new SelectionSort();
		selectionSort.selectionSort(arr, arr.length);
		
		System.out.println();
		System.out.println("searching "+x);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
		System.out.println();
		int val=binarySearch.search(arr, arr.length, x);
		System.out.println(val);
	}
}
