package StringClass;

import java.util.Scanner;

public class UniqueCharectersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int ans=UniqueCharectersinString.uniqueCounter(str);
		System.out.println(ans);
		in.close();
}

	private static int uniqueCounter(String str) {
		// TODO Auto-generated method stub
		int count =0;
		for( int i=0 ; i < str.length() ; i++) {
			char a = str.charAt(i);
			System.out.println(a);
			if (str.indexOf(a,i+1) <= i && str.indexOf(a) >= i) {
				count++;
			}
		}
		return count;
	}
}
