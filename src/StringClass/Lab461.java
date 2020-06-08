package StringClass;

import com.satish.lang.Adress;

public class Lab461 {

	public static void main(String[] args) {
		String ab ="   satish    ";
		String st1 = trim(ab);
		System.out.println(st1);
}
	private static String trim(String ab) {
		int length = ab.length();
		char ab1[] =ab.toCharArray();
		int i =0;
		while(length >0  && ab1[i] == ' ') {
			i++;
		}
		while(i < length && ab1[length-1] == ' ') {
			length--;
		}
		return (i >0 || length < ab.length())?ab.substring(i, length):ab;
	}}
