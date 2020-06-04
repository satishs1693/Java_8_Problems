import java.util.*;
import java.util.stream.Stream;
public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(1, i -> i+1)
			   .filter(i -> i%2 == 0 )
			   .limit(50)
			   .forEach(System.out::println);
	}
}
  