
class Student15 {
	static Student15 stu = null;
	private Student15() {
		System.out.println("Hellllllo India");

	}
	public synchronized static Student15 getInstance() {
		return stu == null ? stu=new Student15() : stu;
	}
}
public class SingleTon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread( new Runnable() {
		@Override
		public void run() {
			Student15 st2  = Student15.getInstance();
			
			double j;
			for (int i = 0; i < 19 ; i++) {
				j = (double)Math.random();
				System.out.println(i);
			}
			
			
			System.out.println(",,,,,,,,,,,"+st2.hashCode());			
		}
	});
		th.start();
		Student15 st = Student15.getInstance();
		System.out.println(st.hashCode());
		Student15 st1 = Student15.getInstance();
		System.out.println(st==st1);
	
	}
}
