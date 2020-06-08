
public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student12 st1= new Student12(101, 988488);
		Student12 st2 = new Student12(102, 988488);
		Student12 st3= new Student12(103, 988488);
		Student12 st4 = new Student12(101, 988488);
		System.out.println(st1.hashCode() == st4.hashCode());
		
		Object a1 =99;
		
		
		int a =99;
		
		Object obj[] = new Object[5];
		obj[0]=new Object();
		obj[1]=new String("Hello");
		obj[2]=99;
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(st4);
		
		System.out.println(st1);

	}

}

class Student12{
	int sid;
	long phone;
	Student12(int sid ,long phone){
		this .sid = sid;
		this .phone= phone;
	}
	@Override
	public int hashCode() {
		return (int)(phone|sid);
	}
}