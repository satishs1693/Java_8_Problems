package StringClass;

public class Lab496 {
	public static void main(String[] args) {
	String str ="JLC,Java Learning Center .NO 1 in Java Training and Placement."
			+ "Java is popular language";
	String res[]= str.split("Java",10000);
	for (int i = 0; i < res.length; i++) {
		System.out.println(res[i] +">>>>>>>>>>>>>>>>."+res.length);
	}
		
	}
}
