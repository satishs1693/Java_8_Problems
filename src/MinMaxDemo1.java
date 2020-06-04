import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(42, 44, 43, 41);
		numList.stream().mapToInt(e->e).min().ifPresent(System.out::println);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		numList.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
		numList.stream().reduce(Integer::max).ifPresent(System.out::println);
		numList.stream().reduce((s1,s2)->{
			if(s1.compareTo(s2) <= 0 ) {
				return s1;
			}else return s2;
		}).ifPresent(System.out::println);
		numList.stream().reduce((s1,s2)->{
			if(s1.compareTo(s2) >= 0 ) {
				return s1;
			}else return s2;
		}).ifPresent(System.out::println);
	}

}
