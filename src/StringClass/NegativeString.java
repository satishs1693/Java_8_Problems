package StringClass;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NegativeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		System.out.println(NegativeString.negativeString(s1));
		in.close();
	}
	private static String negativeString(String s1) {
		StringBuffer sf = new StringBuffer();
		StringTokenizer st = new StringTokenizer(s1," ");
		String s3;
		while(st.hasMoreTokens()) {
		String s2 = st.nextToken();
		sf=s2.equals("is") ? sf.append("is not").append(" "):sf.append(s2).append(" ");
		}
		return sf.toString();
	}

}
