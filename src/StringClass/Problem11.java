package StringClass;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String input_string = sc.nextLine();
		int length = input_string.length();
		char d;
		for (int i = 0; i < length; i++) {
			d = input_string.charAt(i);
			if ((i + 1) % 2 != 0) {
				if (d == 'z') {
					sb.append(d);
				} else if (d == 'Z') {
					sb.append(d);
				}else {
					sb.append((char)((int)d+ 1));
				}
				continue;
			}
				sb.append(d);
		}
		System.out.println(sb);

	}

}
