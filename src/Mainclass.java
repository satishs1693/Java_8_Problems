class A {
	void m1() {  System.out.println("This is A - m1() class methoed ");}
	void A() { 	 System.out.println("This is A  class A Methoed ");}	
}

class B extends A{
	void m1() {  System.out.println("This is B - m1() class methoed ");}
	void B() { 	 System.out.println("This is B class Methoed ");}	
}
class C extends A{
	void m1() {  System.out.println("This is C - m1() class methoed ");}
	void C() { 	 System.out.println("This is C class Methoed ");  }	
}
class D extends B{
	void m1() {  System.out.println("This is D - m1() class methoed ");}
	void D()  {  System.out.println("This is C class Methoed ");  }	
}
class E{}
public class  Mainclass{
	public static void main(String[] args) {
		System.out.println("SSSSSSSSSSSSSSS");
		D dobj = new D();
		A aobj =dobj;
		
		aobj.m1();
		System.out.println("*********************************************");
		
		B obj =(B) aobj;
		obj.m1();
		
		System.out.println("*********************************************");

		System.out.println(obj);
		D dobj1 =(D)aobj;
		dobj1.m1();
		
	}
}