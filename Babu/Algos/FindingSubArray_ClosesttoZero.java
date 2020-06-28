package Algos;
import java.util.Arrays;
public class FindingSubArray_ClosesttoZero {
	public static void main(String[] args) {
		//int arr[]= {4,16,28,37,42,56,63,89,124,245};
		int arr[]= { 5,10,-8,2,3,-5};
		threeSumClosest(arr,101);
	}
	public static void threeSumClosest(int[] nums, int target) {
			Arrays.sort(nums);
			int closest = 0;
			int m=0;
			int n =0;
			int diff=0;
			int minDiff = Integer.MAX_VALUE;
				int j = 0;
				int k = nums.length - 1;
				while (j < k) {
					int sum = nums[k] + nums[j] ;
					if (sum == target) {
					   System.out.println("****************");
					   break;
					}
					System.out.println(sum-target);
					System.out.println("^^^^^^^^^^^^^^^");
					System.out.println(target-sum);
					diff = Math.abs(sum-target);
					//System.out.println("diff       "+diff);
					//System.out.println(diff);
					if (diff < minDiff) {
						minDiff = diff;
						m=j;
						n=k;
					}
					if(sum < target) {
						j++;
						System.out.println();
					}
					else if(sum > target) {
						k--;
					}
					//System.out.println("target               "+target+"Sum        "+sum);
					
				}
				System.out.println("******************");
				System.out.println(nums[m]);
				System.out.println(nums[n]);
}
	private static void FindingSubArray_ClosesttoZero_1(int[] array ) {
		int min_r_index=0;
		int min_l_index=0;
		int closest_sum=999999;
		int currentsum=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length-1; j++) {
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
