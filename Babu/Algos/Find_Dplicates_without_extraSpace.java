package Algos;

public class Find_Dplicates_without_extraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,4,5,6,4,5,8,9,7,8};
		for (int j = 0; j < arr.length; j++) {
			if (arr[Math.abs(arr[j])] >= 0) {
			arr[Math.abs(arr[j])] = -arr[Math.abs(arr[j])];
			}else {
				System.out.printf(" %d" ,Math.abs(arr[j]));
			}
		}
	}

}
