import java.util.Arrays;
import java.util.List;

public class Assignment1Q4 {
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,2,3,1,5);
		
		// here we use max method in stream and also the lambda feature in java8.
		int maxnum = (int) li.stream().mapToInt(val -> val).max().getAsInt();
		System.out.println("Maximum number in array list is :"+ maxnum);
		}
}
