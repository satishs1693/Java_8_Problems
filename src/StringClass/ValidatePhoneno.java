package StringClass;

import java.util.Scanner;

public class ValidatePhoneno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		int ans = ValidatePhoneno.validatePhoneNumber(s1);
		if (ans == 1)
			System.out.println("valid");
		else
			System.out.println("invalid");
		in.close();


	}

	private static int validatePhoneNumber(String s1) {
		String reg = "[0-9.-]{12}";
		int l = s1.length();
		int count=0;
		char c;
		if (s1.matches(reg)) {
			int i = 0;
			while (--l >= 0) {
				c = s1.charAt(i);
				if (Character.isDigit(c)) {
					System.out.println(c);
					count++;
				} else if (c != '-') {
					break;
				}
				i++;
			}
			//System.out.println(i);
			if (count == 10 && i==s1.length()) {
				return 1;
			}
		}
		return 0;
	}

}
