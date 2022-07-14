
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;



public class Assignment1Q3
{
public static void main(String[] args)
{
	Collection <String> employee= Arrays.asList( "anurag", "mansi", "raj", "ajinkya", "anurag" ,"ajinkya","sanjeevani", "sanjeevani");

	// here we use sorting and distinct method available in collection stream API.
	List<String> distinctElements = employee.stream().sorted()
	.distinct()
	.collect( Collectors.toList() );
	System.out.println( distinctElements );

}
}
