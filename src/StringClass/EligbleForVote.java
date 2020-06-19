package StringClass;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class EligbleForVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = "12/06/2020";
		System.out.println(EligbleForVote.eligibleForVote(s1, s2));
	}
	private static String eligibleForVote(String s1, String s2) {
		if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			    //String s1;
			   	sdf.setLenient(false);
			   	try {
			   		System.out.println(">>>>>>>>>>>>");
			   		Calendar c = Calendar.getInstance();
			   		Date d1 = sdf.parse(s1);
			   		Date d2 = sdf.parse(s2);
			   		System.out.println(">>>>>>>>>>>>>>>>>>.....");
			   		c.setTime(d1);
			   		int y1=c.get(Calendar.YEAR);
					int m1=c.get(Calendar.MONTH);
					int d11=c.get(Calendar.DATE);
					c.setTime(d2);
					int y2 =c.get(Calendar.YEAR);
					int m2= c.get(Calendar.MONTH);
					int d22=c.get(Calendar.DATE);
					int k=Math.abs(y2-y1);
					System.out.println(">>>>>>>>>>>>"+k);
					if( m1 > m2 ) {
						k--;
					}else if( m1==m2 && d11>d22 ) {
						k--;
					}
					System.out.println(k);
					if( k >= 18 ) {
						return "Eligible";
					}
			   		}catch (Exception e) {
		// TODO: handle exception
			   			System.out.println("****************************");
			   		return"not eligible";
			   		}
        }
		return "not eligible";
	}
}
