package Algos;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[] { 9, 1, 4, 5, 6, 7 };
		Arrays.sort(A);
		int l_index= 0;
		int r_index= A.length-1;
		int target = 6;
		
		while( l_index <= r_index) {
			int m_index=l_index+(r_index-l_index)/2;
			if(target < A[m_index]) {
				r_index= m_index-1;
			}else if(target > A[m_index]) {
				l_index=m_index+1;
			}else if (target == A[m_index]) {
				System.out.println(m_index);
				l_index++;
			}
			}
	}

}
