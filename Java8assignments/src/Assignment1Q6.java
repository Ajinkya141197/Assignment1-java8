import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Assignment1Q6 {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> li = new ArrayList<Integer>();
	
	
    Double avgmark = li.stream().mapToDouble(s -> s.intValue()).average().getAsDouble();
    System.out.println("Average of marks : " +avgmark);

    List<Integer> l=li.stream().filter(i -> i<avgmark).collect(Collectors.toList());

    System.out.println("List of numbers less than average : " +l);
	}
}