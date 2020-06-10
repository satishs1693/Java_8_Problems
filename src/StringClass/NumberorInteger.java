package StringClass;

import java.util.Scanner;

public class NumberorInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner in=new Scanner(System.in);
		s1=in.nextLine();
		int ans=NumberorInteger.sumOfDigits(s1);
		System.out.println(ans);
	}
	 static int sumOfDigits(String s1) {
		int sum =0;
		for( int i=0 ; i < s1.length() ; i++) {	
			//System.out.println((int)s1.charAt(i) );
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				//System.out.println("Hii Satish");
			sum = sum + Integer.parseInt(s1.charAt(i)+"");
			}
		}
		return sum;
	}
}
	