public class Mainclass3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aobj = new A();
		if (aobj instanceof C) {
			System.out.println("A");
			C obj = (C) aobj;
		}
		System.out.println("Hello Guys");
	}
}
