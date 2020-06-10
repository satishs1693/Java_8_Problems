package StringClass;

import java.util.Scanner;

public class checkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int k = input.length();
		if( k >=6 && k <=20 && input.matches(".*[0-9]{1}.*") && input.matches(".*[#@$]{1}.*")) {
			System.out.println("Valid");
		}else System.out.println("Invalid");
	}

}
