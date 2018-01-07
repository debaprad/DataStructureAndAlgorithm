package sort;

import algorithm.sort.SelectionSort;
import datastructur.BinaryTree;

public class MainApp {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 13) + 1;
		}
		InserStionSortTest inserStionSortTest = new InserStionSortTest();
		SelectionSortTest selectionSortTest =  new SelectionSortTest();
		BubbleSortTest bubbleSortTest = new BubbleSortTest();
		ShellSortTest shellSortTest = new ShellSortTest();
		BinarryTreeSort binaryTreeSortTest= new BinarryTreeSort();
		
		System.out.println("=========== selectionSOrt ===========");
		selectionSortTest.sort(arr,arr.length);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
		System.out.println();
		System.out.println("=========== bubbleSort ===========");
		bubbleSortTest.sort(arr,arr.length);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
		System.out.println();
		System.out.println("=========== inserStionSort ===========");
		inserStionSortTest.sort(arr,arr.length);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
		
		System.out.println();
		System.out.println("=========== shellSort ===========");
		shellSortTest.sort(arr,arr.length);
		for(int value : arr)
		{
			System.out.print(value+",");
		}
		
		
		System.out.println();
		System.out.println("=========== BinaryTreeSort ===========");
		for(int x:arr)
		{
			binaryTreeSortTest.insert(x);
		}
		binaryTreeSortTest.inOrder(arr);
		//System.out.println();
		for(int value : arr)
		{
			System.out.print(value+",");
		}
	}
}
