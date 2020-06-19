package StringClass;
import java.util.HashSet;
import java.util.Scanner;
public class countCommon {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] a1 = new String[n];
		for (int i = 0; i < n; i++)
			a1[i] = in.nextLine();
		n = Integer.parseInt(in.nextLine());
		String[] a2 = new String[n];
		for (int i = 0; i < n; i++)
			a2[i] = in.nextLine();
		System.out.println(countCommon(a1, a2));
	}
	private static int countCommon(String[] a1, String[] a2) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		for(int i=0 ; i < a1.length ; i++) {
			hs.add(a1[i]);
		}
		String s1[] = new String[hs.size()];
		hs.toArray(s1);
		HashSet<String> hs2 = new HashSet<String>();
		for( int j=0 ;j < a2.length ;j++) {
			hs2.add(a2[j]);
		}
		String s2[] = new String[hs2.size()];
		hs2.toArray(s2);
		int count=0;
		for(int i=0;i<s1.length;i++)
		{	
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i].equals(s2[j]))
					count++;
			}
		}
		return count;		
	}

}
