public class MyClass{
	
	static String sat ="Hey its third testt";
	
	public static void main(String[] args) {
		final int varible =7;
		Hello h = S -> {
			System.out.println(varible);
			
			System.out.println(""+sat);
			return "hello world";
		};
		
		h.sayhello("Hello world");
		
		sat= "Rageshhhhhhhhh";
		
		h.sayhello("Hello world");
		
	}
}