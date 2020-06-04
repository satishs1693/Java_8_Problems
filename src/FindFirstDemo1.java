import java.util.Arrays;
import java.util.List;

public class FindFirstDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Vijay", "Suresh", "Vinod");
		String output = list.stream().filter(element->element.startsWith("V")).findFirst().orElse("NA");
		System.out.println(output);
	}

}
