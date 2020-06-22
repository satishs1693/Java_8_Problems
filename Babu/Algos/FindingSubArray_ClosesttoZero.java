package Algos;

import java.util.Arrays;

public class FindingSubArray_ClosesttoZero {
	public static void main(String[] args) {
		int array[] = new int[] { -9,0,59,69,-79,84};
		Arrays.sort(array);
		int closest_sum=9999;
		int currentsum=0;
		int l_index=0;
		int r_index=array.length-1;
		int min_r_index=0;
		int min_l_index=0;
		    while( l_index < r_index) {
			currentsum = array[r_index]+array[l_index];
			if( Math.abs(currentsum) < Math.abs(closest_sum)) {
				closest_sum =currentsum;
				min_l_index=l_index;
				min_r_index =r_index;
			}
			if( currentsum > 0) r_index--;
			else l_index++;
		}
		    System.out.println(array[min_l_index]);
		    System.out.println(array[min_r_index]);
		    FindingSubArray_ClosesttoZero_1(array);
	}

	private static void FindingSubArray_ClosesttoZero_1(int[] array ) {
		int min_r_index=0;
		int min_l_index=0;
		int closest_sum=999999;
		int currentsum=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				currentsum = array[i]+array[j];
				if( Math.abs(currentsum) < Math.abs(closest_sum)) {
					closest_sum =currentsum;
					min_l_index=i;
					min_r_index =j;
				}
				
			}
		}
		
	    System.out.println(array[min_l_index]);
	    System.out.println(array[min_r_index]);
	}
}
