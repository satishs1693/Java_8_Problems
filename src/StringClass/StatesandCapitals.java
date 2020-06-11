package StringClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StatesandCapitals {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> l=new HashMap<String,String>();
		Scanner sc =new Scanner(System.in); 
		int n = sc.nextInt();
		for(int i =0 ; i<n ; i++) {
			l.put(sc.next(), sc.next());
		}
		String s2 = sc.next();
		System.out.println(StatesandCapitals.display(l,s2));
	}
private static String display(HashMap<String, String> l, String s2) {
	for( Map.Entry<String, String> st : l.entrySet()) {
		if(st.getKey().equals(s2)) {
			return st.getValue().concat("$").concat(st.getKey());			
		}
	}
	  return "Doen't eists";
	}

}
