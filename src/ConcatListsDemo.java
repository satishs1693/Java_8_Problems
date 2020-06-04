import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConcatListsDemo {
	public static void main(String[] args) {
		List<Book> list1 = new ArrayList<>();
        List<Book> list2 = new ArrayList<>();
        list1.add(new Book("Core Java",200));
        list1.add(new Book("Spring MVC", 300));
        list1.add(new Book("Learning Freemarker", 150));  
        list2.add(new Book("Core Java", 200));
        list2.add(new Book("Spring MVC", 300));
        list2.add(new Book("Learning Hibernate", 400));
        Book []B= Stream.concat(list1.stream(), list2.stream()).distinct().toArray( b-> new Book[b]);
        for(Book b : B) {
        	System.out.println(b.getName()+", "+ b.getPrice());
        }
	}
	
}
