import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDeamo {
	public static void main(String[] args) {
		List<String> Nameslist = Arrays.asList("satish", "samm", "Ragesh", "sukesh", "Ramesh");
		List<Person> person_list = Arrays.asList(new Person("Satish", "101", "EEE"),
				new Person("Satish1", "102", "ECE"), new Person("Satish2", "103", "MEC"));
		// Nameslist.stream().filter(names ->
		// names.startsWith("s")).collect(Collectors.toList()).forEach(System.out::println);
		/*
		 * Optional<String> st=Nameslist.stream().parallel().filter(names ->
		 * names.startsWith("s")).findAny(); if(st.isPresent()) {
		 * System.out.println(st.get()); }else {
		 * System.out.println("elemets Not Present"); }
		 */
		String st1 = Nameslist.stream().filter(names -> names.startsWith("s")).findAny().orElse(null);
		Person pr = person_list.stream().parallel().filter(name -> name.getUser_DEPT() == "EEE").findAny().orElse(null);
		if (null != pr) {
			System.out.println(pr);
		} else {
			System.out.println("Hellooooooooooooooooo");
		}
		System.out.println("==========================");
		person_list.stream().parallel().map(eachName->eachName.getUser_Name()).forEach(System.out::println);
	}
}
