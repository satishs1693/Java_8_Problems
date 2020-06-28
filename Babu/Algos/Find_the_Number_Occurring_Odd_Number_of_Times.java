package Algos;

import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

public class Find_the_Number_Occurring_Odd_Number_of_Times {

	private static final boolean Integer = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 }; 
        int n = arr.length; 
        System.out.println(getOddOccurrence_m2(arr, n)); 

	}
	static int getOddOccurrence(int arr[], int arr_size) {
		int count=0;
	  for (int i = 0; i < arr.length; i++) {
		  for (int j = 0; j < arr.length; j++) {
			  if( arr[i] == arr[j]) {
				  count++;
			  }
		}
		  if( count %2 != 0 )
			  	return arr[i];
	  }
		return -1;
	}
	static int getOddOccurrence_m1(int arr[], int arr_size) {
		HashMap<Integer,Integer> hp = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
				Integer a =  hp.get(arr[i]);
			if( null != a) {
				hp.put(arr[i], a+1);
			}else {
				hp.put(arr[i], 1);
			}
		}
	  for( Integer a : hp.keySet()) {
		 // System.out.println(a);
		  if(hp.get(a)% 2 !=0 ) {
			  return a;
		  }
	  }
	  	return -1;
	}
	
	static int getOddOccurrence_m2(int arr[], int arr_size) {
	 int result = 0;
	 for (int i = 0; i < arr.length; i++) {
		 result = result ^ arr[i];	
	}
	return result;
	}
}
