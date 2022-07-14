import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Assignment1Q1 {
	
	//by normal method
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0,n2=0,n3=0,n4=0, n5=0;
		   
		  while(n1 == 0) {
			  System.out.print("Input Maths number: ");
			  int tempnum1 = sc.nextInt();
		  if(tempnum1 > 101) {
			  System.out.println("please correct number");
		  }
		  else {
			   n1= tempnum1;
		  }
		  }
		  
		  while(n2 == 0) { 
		  System.out.print("Input English number: ");
		  int tempnum2 = sc.nextInt();
		  if(tempnum2 > 101) {
			  System.out.println("please correct number");
		  }
		  else {
			   n2= tempnum2;
		  }
		  }
		   
		  while(n3 == 0) { 
		  System.out.print("Input Marath number: ");
		  int tempnum3 = sc.nextInt();
		  if(tempnum3 > 101) {
			  System.out.println("please correct number");
		  }
		  else {
			   n3= tempnum3;
		  }
		  }
		  
		  while(n4 == 0) {  
		  System.out.print("Input science number: ");
		  int tempnum4 = sc.nextInt();
		  if(tempnum4 > 101) {
			  System.out.println("please correct number");
		  }
		  else {
			   n4= tempnum4;
		  }
		  }
		  
		  while(n5 == 0) { 
		  System.out.print("Enter History number: ");
		  int tempnum5 = sc.nextInt();
		  if(tempnum5 > 101) {
			  System.out.println("please correct number");
		  }
		  else {
			   n5= tempnum5;
		  }
		  }
		      
		  System.out.println("Average of five numbers is: " + 
		   (n1 + n2 + n3 + n4 + n5) / 5);
	
		  
		  // By using lambda and stream API
			List<Integer> Marks = Arrays.asList(n1 , n2 , n3 , n4 , n5); 
		Double y= Marks.stream().mapToInt(val -> val).average().getAsDouble();
			System.out.println("Average of all MARKS numbers : " + y);

	}
	
}
