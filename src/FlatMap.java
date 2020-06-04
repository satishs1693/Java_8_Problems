import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> prime_Numbers = Arrays.asList(2,3,5,7);
		List<Integer> even_Numbers =Arrays.asList(2,4,6,8);
		List<Integer> Odd_Numbers =Arrays.asList(3,5,7);
		List<List<Integer>> total = Arrays.asList(prime_Numbers,even_Numbers,Odd_Numbers);
		List<Integer> lt = total.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(lt.toString());
	}
}
