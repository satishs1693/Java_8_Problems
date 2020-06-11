package StringClass;

//Write a program to read a sentence as a string and store only the last letter of each word of the sentence in capital letters separated by $. Print the final string


import java.util.Scanner;
import java.util.StringTokenizer;

public class LastLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		System.out.println(LastLetter.getLastLetter(s1));
		in.close();
	}

	private static String getLastLetter(String s1) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(s1);
		StringBuffer sf = new StringBuffer();
		while(st.hasMoreElements()) {
			String st1 = st.nextToken();
			sf.append(st1.charAt(st1.length()-1)).append("$");
		}
		sf.deleteCharAt(sf.length()-1);
		return sf.toString();
	}
}
