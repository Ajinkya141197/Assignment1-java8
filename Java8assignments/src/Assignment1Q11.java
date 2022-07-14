import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1Q11 {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		while(true) {
			System.out.println("please add no");

			Scanner sc= new Scanner(System.in);
			int a= sc.nextInt();
			if (a!=0) {
				
			numbers.add(a);
				System.out.println("if you dont want to add no press 0");
			}else {
				break;
			}
			}
		
		System.out.println("find any in parallel stream");
		numbers.stream().parallel().filter(n -> n>0).findAny().ifPresent(System.out::println);

		}
}

