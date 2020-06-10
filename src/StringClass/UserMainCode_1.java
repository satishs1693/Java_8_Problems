package StringClass;
import java.util.Scanner;
public class UserMainCode_1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sizeofarray = sc.nextInt();
		String st[] = new String[sizeofarray];
		for( int i =0 ; i < sizeofarray ; i++) {
			st[i]=sc.nextLine();
		}
		int k=Integer.parseInt(sc.nextLine());
		System.out.println(UserMainCode_1.removeElements(st,k));
		sc.close();
	}
	private static int removeElements(String[] st, int k) {
		int a=st.length;
		// TODO Auto-generated method stub
		for (int i = 0; i < st.length; i++) {
			if ( st[i].length() == k) {
			--a;	
			}
		}
		return a;
	}
}
