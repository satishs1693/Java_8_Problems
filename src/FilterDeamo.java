import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDeamo {
	public static void main(String[] args) {
		List<String> Nameslist = Arrays.asList("satish", "samm", "Ragesh", "sukesh", "Ramesh");
		//Nameslist.stream().filter(names -> names.startsWith("s")).collect(Collectors.toList()).forEach(System.out::println);
		Optional<String> st=Nameslist.stream().parallel().filter(names -> names.startsWith("s")).findAny();
		if(st.isPresent()) {
			System.out.println(st.get());
		}else {
			System.out.println("elemets Not Present");
		}
	}
}
