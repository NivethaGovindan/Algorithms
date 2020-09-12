package sortingAlgos;

import java.util.Arrays;

public class selectionSort {
	
	public static void main(String args[]) {
		int arr[] = {5, 3, 8, 2};
		int n = arr.length;
		int min = arr[0];
		
		for(int i=0; i<n-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[i]) {
					minIndex = j;
					min = arr[minIndex];
				}
			}
			
			if(i!=minIndex) {
				arr[minIndex] = arr[i];
				arr[i] = min;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
