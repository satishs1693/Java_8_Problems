package StringClass;
public class Lab458 {
	public static void main(String[] args) {
		
	String st1 = "JLC";
	String st2 = new String("JLC");
	String st3 =  st2.intern();
	String st4 = new String("JLC");
	System.out.println( st1==st3);
	String st5 = st4.intern();
	System.out.println(st3==st5);	
	}
}
