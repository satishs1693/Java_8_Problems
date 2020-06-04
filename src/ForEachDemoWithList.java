import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemoWithList {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ram", "male"));
		list.add(new Student("Meera", "female"));
		list.add(new Student("Kabir", "male"));
		Consumer<Student> ct = (Student s) ->{
			if(s.getGender().equals("male")){
				System.out.println(s.getName());
			}
		};
		//list.forEach(ct);
		//list.forEach(Student::printMaleStds);
		list.stream().filter(Student -> Student.getGender().equals("male"))
					.map(Student->Student.getName())
					.forEach(System.out::println);
		
		
	}
}
