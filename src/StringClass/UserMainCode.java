package StringClass;

import java.util.Scanner;

public class UserMainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        String n1=in.nextLine();
        String n2=in.nextLine();
        String n3=UserMainCode.concatstring(n1,n2);
        System.out.println(n3);
	}

	private static String concatstring(String n1, String n2) {
		// TODO Auto-generated method stub
		String s3="";
		int n1_length=n1.length();
		int n2_length= n2.length();
		if(n1_length==n2.length()) s3=n1.concat(n2);
		else if(n2.length()>n1.length()) s3=n2.substring(n2_length-n1_length).concat(n1);
		else if(n2.length()<n1.length()) s3=n1.substring(n1_length-n2_length).concat(n2);
		return s3;
	}

}
