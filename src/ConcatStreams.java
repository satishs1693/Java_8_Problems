import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s1 = Stream.of("100", "satish" ,"Ragesh");
		Stream<String> s2 = Stream.of("101","sat" ,"Rgesh", "Ragesh");
		String a[]=Stream.concat(s1, s2).distinct().toArray( s -> new String[s]);
		for( String data : a) {
			System.out.println( data);
		}
	}

}
