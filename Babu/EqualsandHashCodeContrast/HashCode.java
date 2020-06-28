package EqualsandHashCodeContrast;
import java.util.ArrayList;
import java.util.List;

public class HashCode {
	public static void main(String[] args) {
		List lt = new ArrayList();
		lt.add(5);
		List lt6=new ArrayList();
		lt6.add(5);
		System.out.println(lt.hashCode());
		System.out.println(lt6.hashCode());
	}
}
