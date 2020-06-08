package StringClass;

public class Lab495 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="JLC ,java Learning Center .No in Java Traing and JAVA is popular la";		
		String rest[] = str.split("Java");	
		System.out.println(rest.length);
		for (int i = 0; i < rest.length; i++) {
			String st = rest[i];
			System.out.println(i +"\t  "+st);	
		}
		
		String exp ="[A-Za-z0-9]*";
		
		System.out.println("Satish".matches(exp));
		
	}

}
