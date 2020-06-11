package StringClass;

import java.util.Scanner;

public class DashCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		int b = DashCheck.compareDashes(s1, s2);
		if (b == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	private static int compareDashes(String s1, String s2) {
		// TODO Auto-generated method stub
		int i, j, flag = 0;
		for (i = 0, j = 0; s1.length() > i || s2.length() > j; i++, j++) {
			if (s1.length() == i)
				if (s1.substring(i - 1).contains("-")) {
					flag = 1;
					break;
				}
			if (s2.length() == i) {
				if (s1.substring(i - 1).contains("-")) {
					flag = 1;
					break;
				}
			}
			if (s1.charAt(i) =='-') {
				if (s1.charAt(i) != s2.charAt(j)) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 1) {
			return 0;
		}
		return 1;
	}
}
