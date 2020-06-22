/*package Algos;

public class FindMax_Deff_Bw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 * In this method, instead of taking difference of the picked element with every other element, we take the difference with the minimum element found so far. So we need to keep track of 2 things:
1) Maximum difference found so far (max_diff).
2) Minimum number visited so far (min_element).
		 

		int a[] = new int[] { 4,3,10,2,9,1,6};
		int min_element = a[0];
		int max_diff= -1;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] < min_element) {
				min_element =a[i];
			}else {
				if( a[i]- min_element > max_diff) {
				max_diff =a[i]-min_element;
				System.out.println(max_diff);
				System.out.println(a[i]);
				}
			}
		}
		

}
}*/
/*
 * // Java program to find Maximum difference //between two elements such that
 * larger //element appears after the smaller number
 * 
 * import java.io.*;
 * 
 * class GFG { /* The function assumes that there are at least two elements in
 * array. The function returns a negative value if the array is sorted in
 * decreasing order and returns 0 if elements are equal static int maxDiff(int
 * arr[], int n) { // Initialize Result int maxDiff = -1;
 * 
 * // Initialize max element from right side int maxRight = arr[n-1];
 * 
 * for (int i = n-2; i >= 0; i--) { if (arr[i] > maxRight) maxRight = arr[i];
 * else { int diff = maxRight - arr[i]; if (diff > maxDiff) { maxDiff = diff; }
 * } } return maxDiff; }
 * 
 * Driver program to test above function public static void main (String[] args)
 * { int arr[] = {1, 2, 90, 10, 110}; int n = arr.length;
 * 
 * //Function calling System.out.println ("Maximum difference is " +
 * maxDiff(arr, n)); } //This code is contributed by Tushil.. }
 */