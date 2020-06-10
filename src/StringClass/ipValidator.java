package StringClass;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ipValidator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		//System.out.println(s1);
		//String[] st = s1.split("\\.",5);
		StringTokenizer st1 = new StringTokenizer(s1,".");
		int m=0;
		//System.out.println(st.toString());
		while (st1.hasMoreTokens()) {
			int k = Integer.parseInt(st1.nextToken());
            if(k>=0 && k <=255) {
            	++m;
            }
		}
		if(m==4) {
			System.out.println("VALID");
		}else {
			System.out.println("INvalid");
		}
	}
}
