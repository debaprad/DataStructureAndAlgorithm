package algorithm.sort;

public class ShellSort {

	public void shellSort(int[] arr, int n, int shell) {
		System.out.println("original array");
		for (int value : arr) {
			System.out.print(value + ",");
		}
		System.out.println();
		while (shell >= 1) {
			for (int i =  shell; i < n; i++) {
				int temp = arr[i];
				int j = i - shell;
				System.out.println("j is :: "+j);
				for (; j >= 0 && arr[j] > temp; j = j - shell) {
					System.out.println("insertion sort between arr["+i+"] and arr["+j+"]");
					arr[j + shell] = arr[j];
				}
				arr[j + shell] = temp;
				for (int value : arr) {
					System.out.print(value + ",");
				}
				System.out.println("--- for i "+i);
			}
			
			System.out.println();
			System.out.println("-----------");
			shell = shell-2;
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[18];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 13) + 1;
		}
		arr[0] = 177;
		arr[1] = 15;
		arr[2] = 13;
		arr[3] = 10;
		arr[4] = 12;
		arr[5] = 9;
		arr[6] = 4;
		arr[7] = 2;
		arr[8] = 7;
		arr[9] = 5;
		arr[10] = 1;
		arr[11] = 1;
		arr[12] = 3;
		arr[13] = 6;
		arr[14] = 8;
		arr[15] = 14;
		
		ShellSort shellSort = new ShellSort();
		shellSort.shellSort(arr, arr.length, 5);
		for (int value : arr) {
			System.out.print(value + ",");
		}

	}
}
