package StringClass;

import java.util.Scanner;

//Write a program to read a string array and return 1 if all the elements of the array are numbers, else return -1

public class ALL_Number_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());
		String[] array = new String[n];
		for (int i = 0; i < array.length; i++) {
			array[i] =sc.nextLine();
		}
		int out = All_Elements_Array( array);
		if(out == 1) {
			System.out.println("All elemets are Numbers");
		}else
			System.out.println("All ekements are not the numbers");
	}
private static int All_Elements_Array(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if(!array[i].matches("[0-9]*")) {
				return -1;
			}
		}
		return 1;
	}
}


