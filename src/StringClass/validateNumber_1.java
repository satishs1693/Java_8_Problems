package StringClass;

import java.util.Scanner;

public class validateNumber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Obtain two strings S1,S2 from user as input. Your program should count the number of times S2 appears in S1.
		
		Scanner in=new Scanner(System.in);
        String n1=in.nextLine();
        String n=in.nextLine();
        System.out.println(validateNumber_1.validateNumber(n1,n));
	}
	private static int validateNumber(String n1, String n) {
		String s1 = n1.replace(n, "$");
		int count=0;
		for(int i=0 ; i<s1.length() ;i++ ) {
			if(s1.charAt(i) == '$') {
				count++;
			}
		}
		return count;
	}

}
