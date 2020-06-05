import java.util.*;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSInput;

public class Listoperations {
	public static void main(String[] args) {
		List<String> col = new ArrayList<String>();
		col.add("sat");
		System.out.println(col);
		col.add(1,"satish");
		col.add(1, "Ragesh");
		col.add(1, "Ragesh");
		System.out.println(col);
		System.out.println(col.remove(1));
		System.out.println(col.remove("Ragesh"));
		System.out.println(col.contains("sat"));
		System.out.println(col.get(1));
		System.out.println(col.set(1, "Ragesh"));  //Replaces the Object at specific index and return the eisting Object
		System.out.println(col.indexOf("Ragesh"));
		System.out.println(col.lastIndexOf("Ragesh"));
		List<String> list2 = new ArrayList<>(col);// make an actual copy of v1
		list2.add("Satish Tokala");
		System.out.println(col);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		list2.stream().sorted().collect(Collectors.toList()).forEach(element->System.out.println(element));
		List<List<String>> ls  = new ArrayList<List<String>>(Arrays.asList(col,list2));
		System.out.println(ls);
		System.out.println("************************************");
		ls.stream().flatMap(list->list.stream()).collect(Collectors.toList()).forEach(element->System.out.println(element));
		System.out.println("####################################");
		Collection col1 = new ArrayList<>();
		col1.add("java");
		col1.add("jsp");
		col1.add("JNI");
		List col2 = new ArrayList<>(col1);
		System.out.println(col2);
		Iterator it = col2.iterator();
		while (it.hasNext()) {
			System.out.println("***************");
			Object object = (Object) it.next();
			if (object.equals("JNI")) {
				 int i =col2.indexOf("JNI");
				 System.out.println(i);
				//.out.println(col.remove(col.indexOf("JNI")));
				 System.out.println("%%%%%%%%%%%%");
				System.out.println(col2.set(i, "J2EE"));
			} 
		}

	}
}
	