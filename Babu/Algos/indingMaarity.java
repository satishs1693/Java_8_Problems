package Algos;

public class indingMaarity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] { 9, 1, 2 , 2,2 };
		int m_index=0;
		int count =1;
		for (int i = 1; i < A.length; i++) {
			if(A[m_index] == A[i] ) count++;
			else count--;
			if(count==0) {
				m_index = i;
				count=1;
			}	
		}
		System.out.println(m_index);
		//Checking whether majority index i present or not
		for (int i = 0; i < A.length; i++) {
			if(A[m_index] == A[i]) {
				count++;
			}
		}
		if ( count > A.length /2 ) {
		     System.out.println( A[m_index]);
		}else {
			System.out.println("No Majority Index");
		}
	}

}
