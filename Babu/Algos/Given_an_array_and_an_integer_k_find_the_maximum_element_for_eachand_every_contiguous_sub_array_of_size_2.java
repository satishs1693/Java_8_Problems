package Algos;

public class Given_an_array_and_an_integer_k_find_the_maximum_element_for_eachand_every_contiguous_sub_array_of_size_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arry[] = {1,2,3,4,1,4,5,1,3,6,7};
		int sub_arry_size=3;
		Maximumelement(arry,arry.length,sub_arry_size);
	}
	private static void Maximumelement(int[] arry, int length, int sub_arry_size) {
		int max=0;
		for (int i = 0; i < length-sub_arry_size; i++) {
			max=arry[i];
			for (int j = 0; j < sub_arry_size; j++) {
				if(arry[i+j]> max) {
					max=arry[i+j];
				}
			}
			System.out.println(max);
		}
	}
}

// Thre are three more ways but not simple
//window sliding is the sim