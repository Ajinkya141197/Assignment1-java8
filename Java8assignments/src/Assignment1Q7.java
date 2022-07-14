import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment1Q7 {

	   public static void main(String[] args) {
	        List<Integer> list= Arrays.asList(14252,100,32,4, 0, 90);
	        List<Integer> evenNumbers= list.stream()
	        		.filter(a-> a%2==0)
	        		.collect(Collectors.toList()); 
	            System.out.println(evenNumbers);
	    }
}
