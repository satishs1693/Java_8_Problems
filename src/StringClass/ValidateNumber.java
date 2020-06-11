package StringClass;

//Write a program to read a string and return an integer based on the following rules.
//If the first word and the last word in the String match, then return the number of characters in the word 
//else return sum of the characters in both words. Assume the Strings to be case - sensitive.
import java.util.Scanner;

public class ValidateNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String n1 = in.nextLine();
		System.out.println(ValidateNumber.validateNumber(n1));
	}
	private static int  validateNumber(String n1) {
		int a=n1.indexOf(" ");
		int b=n1.lastIndexOf(' ');
		String FirstWord =n1.substring(0,a);
		String Secondindex= n1.substring(b+1);
			return FirstWord.equals(Secondindex)?FirstWord.length():FirstWord.length()+Secondindex.length();
	}

}
