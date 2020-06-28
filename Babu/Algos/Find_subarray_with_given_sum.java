package Algos;

import java.util.HashMap;

public class Find_subarray_with_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }; 
        int n = arr.length; 
        int sum = 23; 
        subAraayGivenSum_3(arr,arr.length,sum);
	}
	
	//It will work or positive no also
	private static void subAraayGivenSum_3(int[] arr, int length, int taget) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int total_sum=0;
		int key=0;
		for (int i = 0; i < arr.length; i++) {
			total_sum =total_sum+arr[i];
			hm.put(total_sum, i);
			if(hm.containsKey(total_sum-taget)){
				System.out.println(hm.get(total_sum-taget)+1);
				System.out.println(i);
			}
		}
	}


	// It will not wok for the -Ve no's 
	private static void subAraayGivenSum_2(int[] arr, int length, int sum) {
		int right_index=0;
		int left_index=0;
		int current_sum=arr[0];
		for (int i = 0; left_index < arr.length; i++) {
			 if( current_sum < sum) {
				right_index++;
				current_sum+=arr[right_index];
			}else if( current_sum > sum) {
				current_sum-=arr[left_index];
				left_index++;
			}else if( current_sum == sum ) {
				System.out.println(current_sum);
				System.out.println(sum);
				System.out.println(" Sub arry is "+ arr[left_index] +"      "+arr[right_index]);
				break;
			}	
		}	 
	}
	private static void subAraayGivenSum(int[] arry, int length, int sum) {
		int max=0;
		int cur_sum=0;
		for (int i = 0; i < arry.length; i++) {
			cur_sum=arry[i];
			for (int j = i+1; j < arry.length; j++) {
				cur_sum +=arry[j];
				if(cur_sum==sum) {
					System.out.println(i+"......"+j);
				}
				if(cur_sum > sum || j == arry.length) {
					break;
				}
			}
			
		}
	}
}

