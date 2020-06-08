package StringClass;

import com.satish.lang.Adress;

public class Lab461 {

	public static void main(String[] args) {
		String ab ="   satish    ";
	    int a = trim(ab).hashCode();
	    String str ="";
		if ( str.length() == 0) {
			System.out.println("is  empty");
		}
		char cArr[]= {'J','L','C','I','N','D','I','A'};
		String stw8 = new String(cArr);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+stw8);
		
		String str1 = "JLCINDIADAVULURU";
		str1.charAt(str1.length()-1);
		System.out.println(str1.charAt(str1.length()-1));
		char cArr1[] = {'J','L','C','I','H','F','G'};
		//String st6= new String(cArr1,3,5);
		//System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7"+st6);
		String str7="Hai, JLC welcome to JLC";
		String str8 =str7.replaceAll("JLC", "Satish");
		System.out.println(str8);
		String str3 ="Welcome to JLC , Java Training Center ,No 1 in Java Traing and placement";
		System.out.println("++++++++++++++++++:"+str3.indexOf("Java"));
	//	String str11 = "JLCLLLLL".replaceFirst(regex, replacement)('L', 'H');
		int c = "SATISHTOKALA".indexOf('L');
		String str12 = replace('L', 'H',"JHHHHHHHLLLLCCCLLLL");
		System.out.println(str12);
//		boolean st = startsWith1("J" , str11)
//		boolean st2= endsWith("A",str11);
		String strq = replace('L','H',str12); 
		System.out.println(".............."+str12);
		String st4 ="JLCINDIA";
		System.out.println("********************"+st4.substring(0));
		System.out.println("********************"+st4.substring(3));
		System.out.println("*********************"+st4.substring(0, 4));
		System.out.println("**********************"+st4.substring(3, 5));
		//System.out.println("*********************"+str.substring(3, endIndex));
		
		
		
		
}	private static String replace(char oldChar, char newChar ,String actual) {
		char ac[] = actual.toCharArray();
		int i = -1;
		if ( oldChar != newChar) {
			while( ++i < ac.length) {
				if(ac[i]==oldChar) break;
			}
			if( i < ac.length) { 
				char buf[] = new char[ac.length];
				for ( int j = 0 ; j < i ; j++ ) {
					buf[j] = ac[j];
				}
				while( i < ac.length) {
					char h = ac[i];
					buf[i] = (h==oldChar)?newChar:h;
					i++;
				}
				return String.valueOf(buf);
			}
		}

		return null;
	}
	private static boolean endsWith(String prefix ,String actual) {
		// TODO Auto-generated method stub
		int actual_length=actual.length();
		int prefix_length=prefix.length();
		char ac[] = actual.toCharArray();
		char pr[] = prefix.toCharArray();
		int j =0;
		int offset = actual_length - prefix_length;
		while( --prefix_length >= 0) {
			if ( ac[offset++] != pr[j]) return false;
		}
		return true;
	}
	private static  boolean startsWith1(String prefix ,String actual) {
		int actual_length=actual.length();
		int prefix_length=prefix.length();
		char ac[] = actual.toCharArray();
		char pr[] = prefix.toCharArray();
		int i = 0,j=0 ;
		while ( --prefix_length >= 0) {
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<,");
			if(ac[i++] != pr[j++]) {
				System.out.println(">>>>>>>>>>"+ac[i]);
				//System.out.println(">>>>>>>>>>"+pr[j]);
				return false;
			}
		}
    	return true;
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
	}
}
	
