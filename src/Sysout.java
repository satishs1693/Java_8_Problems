
public class Sysout {
	public interface Hello {
			public String sayhello(String s);
	}
	public static void testGreeting(String s, Hello s1) {
		String result = s1.sayhello(s);
		System.out.println("Result         " + result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGreeting("Satish", S -> "Hello ," + S);
		testGreeting("Ragesh", S -> "Hello ," + S);
		testGreeting("ragesh", S -> S.isEmpty() ? "Did you Missed the Somthing?" : "Hello ," + S);
	}
}