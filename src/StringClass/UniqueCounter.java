package StringClass;

import java.util.Scanner;

public class UniqueCounter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str1 = in.nextLine();
		int ans = UniqueCounter.uniqueCounter(str, str1);
		System.out.println(ans);
		in.close();
	}
//	private static int uniqueCounter(String str, String str1) {
//		int count = 0;
//		str=str.replaceAll("\\s+","");
//		System.out.println(str);
//		str1=str1.replaceAll("\\s+","");
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = 0; j <str1.length(); j++) {
//				if (str.charAt(i) == str1.charAt(j)) {
//					System.out.println(str.charAt(i) +"........."+str.indexOf(str.charAt(i), i+1));
//					if ((str.indexOf(str.charAt(i), i+1) < i)  &&  str.indexOf(str.charAt(i)) >= i) {
//						System.out.println(str.charAt(i));
//						count++;
//					}
//				}
//			}
//		}
//		return count;
//	}
private static int uniqueCounter(String str, String str1) {
		str=str.replaceAll("\\s+","");
		System.out.println(str);
		str1=str1.replaceAll("\\s+","");
		String temp1 ;
		String temp2;
		String sigchar,secchar;
		int sec,count = 0;
		for ( int i =0 ; i < str.length() ; i++) {
				temp1=   i!=0 ?str.substring(0,i).concat(str.substring(i+1)):str.substring(i+1);
				sigchar =str.charAt(i)+"";
				if( !temp1.contains(sigchar) && str1.contains(sigchar)) {
					sec= str1.indexOf(sigchar);
					temp2 = sec!=0 ?str1.substring(0,sec).concat(str1.substring(sec+1)):str1.substring(sec+1);
					if(!temp2.contains(sigchar)) {
						count++;
					}
				}	
				}
		
		// TODO Auto-generated method stub
		return count;
	}
}
