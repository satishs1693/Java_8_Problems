package Algos;
import java.util.Arrays;
public class SeparateZerosandOnes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zeros = new int[] {0, 1, 0, 1, 1, 1};
		dividingzerosandones(zeros);
    }
	 private static void dividingzerosandones_2(int[] zeros) {
		 int count =0;
		 for (int i = 0; i < zeros.length; i++) {
			 if( zeros[i] == 0)
			count++;
		}
		for (int i = 0; i <= count; i++) {
			zeros[i]=0;
		}
		for (int i = count; i < zeros.length; i++) {
			zeros[i]=1;
		}
		System.out.println(Arrays.toString(zeros));
	}
	static void dividingzerosandones_1(int[] zeros) {
		 int left_index = 0;
		 int right_index= zeros.length-1;
		 while ( left_index < right_index ) {
			 while( zeros[left_index] ==0 && left_index < right_index )
				 left_index++;
			 while( zeros[right_index] == 1 && left_index < right_index )
				 right_index--;
			 if( left_index < right_index) {
				 zeros[left_index++]=0;
				 zeros[right_index--]=1;
			 }
		 }
	}
	static void dividingzerosandones(int arr[]) { 
        int type0 = 0; 
        int type1 = arr.length - 1; 
          
        while (type0 < type1) { 
            if (arr[type0] == 1) { 
                // swap 
                arr[type1] = arr[type1]+ arr[type0]; 
                arr[type0] = arr[type1]-arr[type0]; 
                arr[type1] = arr[type1]-arr[type0]; 
                type1--; 
            } else { 
                type0++; 
            } 
        } 
        System.out.println(Arrays.toString(arr));
    } 
}
