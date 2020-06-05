import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatArraysDemo {
	public static void main(String[] args) {
	    Book []bk1 = new Book[3];
	    Book []bk2 = new Book[3];
	    {
	    	bk1[0] = new Book("Core Java", 200);
	           bk1[1] = new Book("Spring MVC", 300);
	           bk1[2] = new Book("Learning Freemarker", 150);        	
	           bk2[0] = new Book("Core Java", 200);
	           bk2[1] = new Book("Spring MVC", 300);
	           bk2[2] = new Book("Learning Hibernate", 400);  
	    }
	    Book bk[]=Stream.concat(Stream.of(bk1), Stream.of(bk2)).toArray(b->new Book[b]);
	    Object bk12[]=Stream.concat(Arrays.stream(bk1),Stream.of(bk2)).toArray();
	    		for(Object s : bk12) {
	    	System.out.println(((Book) s).getName());
	    }  
	    List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)) // Stream of List<Integer>
	            .flatMap(List::stream)
	            .map(integer -> integer+1)
	            .collect(Collectors.toList());
	    System.out.println("********************"+together.toString());
	    
	}
}
