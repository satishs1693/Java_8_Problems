package Algos;

public class Palindrome {
	
	public static void main(String[] args) {
		int x=1000;
		System.out.println(isPalindrome(x));
	}
	 public static boolean isPalindrome(int x) {
	        int input =x;
	        int rem=1;
	        int sum=0;
	        if( x < 0 || (x % 10 == 0 && x!=0 )) {
				return false;
			}
	        while( x > 0 ){
	        rem = x%10;
	        sum = sum*10+rem;
	        x= x / 10;
	        }
	        if(sum == input){
	            return true;
	        }
	         return false;
	    }
}
