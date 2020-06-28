package Algos;

import java.awt.image.SampleModel;

public class Count_number_of_smaller_elements_on_right_of_each_element_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,3,4,5,7,1,3,2};
		for (int i = 0; i < array.length; i++) {
			int smaller = array[i];
			System.out.println("******************");
		for (int j = i; j < array.length; j++) {
			//System.out.println(array[i]);
			if(smaller > array[j]) {
				System.out.println(array[j]+"\t");
			}
		   }	
		}
	}
}
