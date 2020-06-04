import java.util.ArrayList;
import java.util.List;

public class FindFirstDemo3 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Emp A", 3000));
		list.add(new Employee("Emp B", 4000));
		list.add(new Employee("Emp C", 5000));
		list.add(new Employee("Emp D", 6000));
		
		list.parallelStream()
			.filter(e->e.getSal() >= 4000 && e.getSal() <= 6000)
			.map(Employee::getName)
			.findFirst()
				.ifPresent(System.out::println);
	}
}
