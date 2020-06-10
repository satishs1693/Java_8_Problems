package StringClass;
import java.util.Scanner;

public class UserMainCode12 {
		
	static int countSequentialChars(String str1)
	{
		System.out.println("Methoed called");
		int c=0;
		for(int i=0;i<str1.length()-2;i++)
		{
			System.out.println("...................."+i);
			System.out.println(">>>>>>>>>>>>>.."+str1.charAt(i));
			if(str1.charAt(i)==str1.charAt(i+1))
			{
				if(str1.charAt(i+1)==str1.charAt(i+2))
{
					++c;
					i=i+2;
}		
			}
		}
		return c;
		
	}
		public static void main(String args[])
	{
		String s1;
		Scanner in=new Scanner(System.in);
		s1=in.nextLine();
		int ans=UserMainCode12.countSequentialChars(s1);
		System.out.println(ans);
		
	}

}
