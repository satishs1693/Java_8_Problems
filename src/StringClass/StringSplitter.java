package StringClass;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		char c = in.next().charAt(0);
		String o[] = StringSplitter.compareDashes(s1, c);
		for (int i = 0; i < o.length; i++)
			System.out.println(o[i]);
		in.close();
	}
	private static String[] compareDashes(String s1, char c) {
		// TODO Auto-generated method stub
		String s2=null;
		StringTokenizer st = new StringTokenizer(s1,c+"");
		int i =0;
		String[] s3= new String[st.countTokens()];
		while(st.hasMoreTokens()) {
			s2=st.nextToken();
			StringBuffer sb = new StringBuffer(s2);
			s3[i]=sb.reverse().toString().toUpperCase();
			++i;
		}
		return s3;
	}

}
