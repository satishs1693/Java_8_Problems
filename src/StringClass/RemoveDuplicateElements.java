package StringClass;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        String[] a1 = new String[n];
        for(int i=0;i<n;i++)
        {
                        a1[i] = in.next();
        }
        a1 = RemoveDuplicateElements.orderElements(a1);
        for(int i=0;i<a1.length;i++)
             System.out.println(""+a1[i]);
	}

	private static String[] orderElements(String[] a1) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < a1.length; i++) {
			hs.add(a1[i]);
		}
		Iterator<String> it = hs.iterator();
		int i =0;
		a1 = new String[hs.size()];
		while(it.hasNext()) {
			a1[i++] = it.next();
		}
		Arrays.sort(a1);
		return a1;
	}

}
