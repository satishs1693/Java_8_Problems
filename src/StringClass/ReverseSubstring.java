package StringClass;

import java.util.Scanner;

public class ReverseSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		int n11=in.nextInt();
		int n21=in.nextInt();
		System.out.println(ReverseSubstring.reverseSubstring(s1,n11,n21));
		in.close();
	}

	private static String reverseSubstring(String s1, int n11, int n21) {
		// TODO Auto-generated method stubs
		String s= "satish";
		StringBuffer sf = new StringBuffer(s1);
		sf=sf.reverse();
		return sf.toString().substring(n11, n21+n11);
	}

}
