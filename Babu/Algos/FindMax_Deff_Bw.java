package Algos;

public class FindMax_Deff_Bw {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 4,3,10,2,9,1,6};
		int max_diff = a[1] -a[0];
		for ( int i= 0 ; i < a.length ; i++) {
			for( int j = i+1 ; j < a.length ; j++) {
				
				// why we are writing the expression in below statement is most power full
				if( a[j]-a[i] >= max_diff) {
					max_diff = a[j]-a[i];
					System.out.println("***********************");
					System.out.println(a[i]);
					System.out.println(a[j]);
					System.out.println(max_diff);
				}
				
			}
		}
	}

}



