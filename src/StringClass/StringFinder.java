package StringClass;

import java.util.Scanner;

public class StringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String s1[] = new String[n];
		for (int i = 0; i < n; i++)
			s1[i] = in.nextLine();
		int a = Integer.parseInt(in.nextLine());
		System.out.println(StringFinder.stringFinder(s1, n, a));
	}

	private static String stringFinder(String[] s1, int n, int a) {
		// TODO Auto-generated method stub
		
		StringBuffer sf = new StringBuffer();
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].length() >= a) {
				sf.append(s1[i].charAt(a-1));
			}else {
				sf.append('$');
			}
		}
		return sf.toString();
	}
}
