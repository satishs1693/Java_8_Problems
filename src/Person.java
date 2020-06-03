
public class Person {
     String User_Name;
	 String User_ID;
	 String User_DEPT;
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public Person(String user_Name, String user_ID, String user_DEPT) {
		super();
		User_Name = user_Name;
		User_ID = user_ID;
		User_DEPT = user_DEPT;
	}
	public String getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}
	public String getUser_DEPT() {
		return User_DEPT;
	}
	@Override
	public String toString() {
		return "Person [User_Name=" + User_Name + ", User_ID=" + User_ID + ", User_DEPT=" + User_DEPT + "]";
	}
	public void setUser_DEPT(String user_DEPT) {
		User_DEPT = user_DEPT;
	}
	
}
