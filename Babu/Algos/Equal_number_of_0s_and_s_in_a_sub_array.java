package Algos;

import java.util.HashMap;

public class Equal_number_of_0s_and_s_in_a_sub_array {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {0, 0, 1, 1, 0};
		//findSunArray(arr);
		//findSunArray_1(arr);
		findSunArray_2(arr);
	}
	private static void findSunArray_2(int[] arr) {
		int sum=0;
		int maxSize=-1;
		int startIndex=0;
		int lastIndex=0;
		HashMap<Integer, Integer> HM = new HashMap<Integer,Integer>();
		for(int i=0; i < arr.length ; i++) {
			 sum=sum+(arr[i]==0?-1:1);
			 if(HM.containsKey(sum)) {
				if(maxSize < i-HM.get(sum)) 
				{
					maxSize = i-HM.get(sum);
					startIndex = HM.get(sum);
					lastIndex =i;
				}
			 }else {
				 HM.put(sum, i);
			 }
		}
		System.out.println(">>>>>>>>>>>>>>>"+startIndex+">>>>>>>>>>>>>"+lastIndex);
		// TODO Auto-generated method stub
	}

	private static void findSunArray_1(int[] arr) {
		
		int sum=0;
		int maxSize=-1;
		int startIndex=0;
		int endIndex=0;
		for (int i = 0; i < arr.length-1; i++) {
			sum=arr[i]==0?-1:1;
			for (int j = i+1; j < arr.length; j++) {
				 sum=sum+(arr[j]==0?-1:1);
				 //System.out.println(sum);
				 if(sum==0 && maxSize < j-i+1) {
					 maxSize=j+i-1;
					 startIndex = i;
				 }
			}
		}
		endIndex = startIndex+maxSize-1;
		if(maxSize > -1) {
			System.out.println("Array Indesis"+startIndex+">.............."+endIndex);
		}else {
			System.out.println("No array");
		}
		
	}
	private static void findSunArray(int []arr) {
		// TODO Auto-generated method stub
		
		int max=0;
		int f_index = 0;
		int s_index=0;
	
		for (int i = 0; i < arr.length; i++) {
			int c_max=0;
			int count_0=0;
			int count_1=0;
			for (int j = 0; j < arr.length-i; j++) {
				//System.out.println("i and j values are"+i       +"        "+j);
				if( arr[i+j] == 0 ) {
					count_0++;
				}else {
					count_1++;
				}
				if(count_0==count_1) {
					c_max=count_1;
				}
				if( c_max > max) {
					 f_index=i;
					 s_index=j;
					 max=c_max;
				}
			}
		}
		System.out.println(max +" "+f_index+" "+s_index);
		
	}
	
	
}
