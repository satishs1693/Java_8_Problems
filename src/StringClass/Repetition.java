package StringClass;

import java.util.Scanner;

public class Repetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		int a=in.nextInt();
		System.out.println(Repetition.repeatString(s1,a));
		in.close();
	}

	private static String repeatString(String s1, int a) {
		StringBuffer sb = new StringBuffer();
		// TODO Auto-generated method stub
		if(a >= 3 ) {
			for (int i = 0; i < a; i++) { 	 		
				sb = sb.append(s1.substring(0,3));
				sb.append(' ');
			}
			return sb.toString();
		}else if(a==2) {
			for(int i=0 ; i<2 ;i++) {
				sb=sb.append(s1.subSequence(0, a));
				sb.append(' ');
			}
			
		}else if(a==1) {
			return s1.charAt(a)+"";
		}
		return sb.toString();
	}

}
