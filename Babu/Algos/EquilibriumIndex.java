package Algos;

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10,5,15,3,4,21,2};
		for(int i = 0; i < arr.length; i++) {
			int right_sum =0;
			int left_sum=0;
			for (int j = 0; j<arr.length ; j++) {
				if(i<j) {
					left_sum =left_sum+arr[j];
				//System.out.println(">>>>>>>>>>"+right_sum);
			    }else {
			      right_sum = right_sum+arr[j];
			    }
				//System.out.println(">>>>>>>>>>"+left_sum + ">>>>>>>>>>" +right_sum);
				if( j ==arr.length-1 && (right_sum == left_sum)  ) System.out.println(arr[i]);
	  }
	}
  }
}
