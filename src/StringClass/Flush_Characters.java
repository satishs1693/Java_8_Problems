package StringClass;

import java.util.Scanner;

public class Flush_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		System.out.println(Flush_Characters.getString(s1));
		in.close();
	}

	private static String getString(String s1) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		char c;
		for(int i=0; i< s1.length() ; i++) {
			c=s1.charAt(i);
			if(!Character.isAlphabetic(s1.charAt(i)) && c !=' ') {
				sb.append(c);
			}	
		}
		return sb.toString();
	}

}
