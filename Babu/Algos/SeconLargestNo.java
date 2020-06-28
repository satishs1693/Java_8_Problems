package Algos;

public class SeconLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[] { 0,3,44,5,9,7};
		Second_largest_no(array);
	}
	private static void Second_largest_no(int[] array) {
		int max=0;
		int secmax=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				secmax = max;
				max= array[i];
			}
			if(max > array[i] && secmax < array[i]) {
				secmax = array[i];
			}	
		}
		System.out.printf( "Thre Max and Highest no are %d , %d",secmax,max );
	}
}
