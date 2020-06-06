public class GetClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1();
		Student1 st1= new Student1();
		showDetails( p1);
		Object ob = new Object();
		showDetails(ob);
	}
public static void showDetails( Object ob) {
		Class cls = ob.getClass();
		Class pt=cls.getSuperclass();
		if( null != pt) {
			System.out.println(pt.getName());	
		}else {
			System.out.println("NO SUPER CLASS ");
		}
		System.out.println("*********************************");
		if( ob instanceof Student1) {
		Student1 st1=(Student1)ob;
		st1.m1();
		
		}else if(ob instanceof Person1) {
			Person1 p1 =(Person1)ob;
			p1.m1();
		}
	}
}
class Person1 {
	void Person1 () {
		System.out.println(" this is Person methoed ");
	}
	void m1() {
		System.out.println(" this is the Person1 m1() ");
	}

}
class Student1 extends Person1{
	void Student1() {
		System.out.println( "this is student methoed ");
	}
	void m1() {
		System.out.println(" this is the Stusent m1() ");
	}
}


