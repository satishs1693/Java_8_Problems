package Algos;

import java.util.Arrays;

public class Tripplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int [] array = new int[] { 0,3,44,5,9,7};
		Arrays.sort(array);
		int target =19;
		tripleLet(array,target);
	}
	private static void tripleLet(int[] array, int target) {
		int sum = 0;
		int temp =0;
		for (int i = 0; i < array.length-2; i++) {
			temp =target-array[i];
			int l_index=i+1;
			int r_index=array.length-1;
			int sum1=0;
			while( l_index < r_index ) {
			    sum1=array[l_index]+array[r_index];
			    //System.out.println(sum1);
			    if ( temp == sum1) {
					   System.out.println(array[i]  +  " " +array[l_index] + " "+array[r_index] );
					   break;
			    }
			   if( temp > sum1 ) l_index++;
			   else r_index--;
			}
		}
	}

}
