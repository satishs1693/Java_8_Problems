package Algos;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] { 9, 1, 4, 5, 6, 7 };
		int swapped, i, j = 0,temp;
		for (i = 0; i < A.length; i++) {
			swapped = 0;
			for (j = 0; j < A.length - 1 - i; j++) {
				if( A[j] > A[j+1]) {
						temp = A[j]; 
	                    A[j] = A[j + 1]; 
	                    A[j + 1] = temp; 
	                    swapped = 1;
				}
			}
			if(swapped == 1) {
				break;
			}	
		}
		System.out.println(Arrays.toString(A));
	}
	private static void swap(int i, int j) {
		i = i+j;
		j = i-j;
		i =i-j;
	}
}
