import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Assignment1Q5 {
	 public static void main(String[] args) {
		    List<String> employee = Arrays.asList("anurag", "ajinkya", "abhishek", "mansi", "praksh","Sanjeevani");
		    Comparator<String> length = (x, y) -> x.length() - y.length();
		    employee.stream()
		        .max(length)
		        .ifPresent(
		            longName -> System.out.println("in array longest name is " + longName));
		  }
}
