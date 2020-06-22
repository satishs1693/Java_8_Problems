package Algos;

import java.util.Arrays;
import java.util.Collections;

public class Algorithems {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[]{2,7,3,5,4};
		//we can initialize array using below way also
		Integer[] it = {1,2,3,4,5};
		//int max =Arrays.stream(it).mapToInt(e->e).min().getAsInt();
		//String[] sa = {"satish","Tokala","Ragesh"};
		int max = Arrays.stream(num).max().getAsInt();
		//One more way to find the max no is 
		//Collections.max(Arrays.asList(num));
		int [] Hash = new int[max+1];
		int taget =9;
		for (int i = 0; i < num.length; i++) {		
			int temp = taget-num[i];
			  //System.out.println(temp);
				if(Hash[temp]==1) {
					System.out.printf("%d %d\n",num[i],temp);
				}else {
					Hash[num[i]]=1;
					//System.out.println(Hash[num[i]]);
				}
		}
	}
}
