class parent {
	String name = "This is Parent";
	public void methoed() {
		System.out.println("This is Parent Class");
	}
	public void Parent() {
		System.out.println("This is Parent Class");
	}
}
class child extends parent {
	String name1 = "This is Child";
	String name = "This is Child";
	public void methoed() {
		System.out.println("This is Child Class");
	}
	public void child() {
		System.out.println("This is Child Class");
	}
}
public class DownCasting_Upcasting{
	public static void main(String[] args) {
		parent parent_object= new child();
		parent_object.methoed();
		System.out.println(parent_object.name);
		//child child_object=(child)new parent();  this gives Error "parent cannot be cast to child"
		child child_object=(child)parent_object;
		child_object.methoed();
		child_object.Parent();
		child_object.child();
		System.out.println(child_object.name);
	}
}