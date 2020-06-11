package StringClass;

import java.util.Scanner;
import java.util.StringTokenizer;

//Write a program to accept two string inputs. The first being a source string and second one a delimiter. 
//The source string contains the delimiter at various locations. Your job is to return the substring with maximum number of characters. If two or more substrings have 
//maximim number of characters return the substring which appears first. The size of the delimiter is 1.
public class Max_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String delimeter=sc.next().charAt(0)+"";
		StringTokenizer st = new StringTokenizer(input,delimeter);
		int Max_Token_len=0;String s,Max_Token_substring = null;
		while(st.hasMoreElements()) {
			 s=st.nextToken();
			if(Max_Token_len < s.length()) {
				Max_Token_len = s.length();
				 Max_Token_substring = s;
			}
		}
		
		System.out.println(Max_Token_substring);
		
	}

}
