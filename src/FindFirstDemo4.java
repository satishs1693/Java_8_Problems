import java.util.stream.Stream;

public class FindFirstDemo4 {

	public static void main(String[] args) {
					
	Stream.of(null,"A").findFirst().ifPresent(s->System.out.println(s));
		
	}

}
