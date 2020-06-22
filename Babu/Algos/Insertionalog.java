package Algos;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Insertionalog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] { 9, 1,4,5,6,7};
		int key =0;
		int i =0;
		for( int j=1 ; j < A.length ; j++) {
			key = A[j];
			i=j-1;
		while( i >= 0  && A[i] > key) {
			A[i+1]=A[i];
			i=i-1;
		}
		A[i+1]=key;
	}// printing the vlues
	System.out.println(Arrays.toString(A));
	}
}

