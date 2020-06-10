package StringClass;

import java.util.Scanner;

public class LargestChuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner in = new Scanner(System.in);
		s1 = in.nextLine();
		int ans = LargestChuk.largestChunk(s1);
		if (ans >= 2)
			System.out.println(ans);
		else
			System.out.println("No Chunks");
	}
	private static int largestChunk(String s1) {
		int cout = 1, max = 0 ,j;
		for (int i = 0; i < s1.length() - 1; i++) {
			cout=1;
			for (j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					cout++;
				} else {
					break;
				}
			}
			if (max < cout) {
				max = cout;
				i=j-1;
			}
		}
		return max;
	}
}
