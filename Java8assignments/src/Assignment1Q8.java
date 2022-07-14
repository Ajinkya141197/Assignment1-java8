import java.util.Scanner;

@FunctionalInterface
interface EvenOddd{
void check(double a);
}


	public class Assignment1Q8 {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Which no do you want to check");
			double a= sc.nextDouble(); 
			
			EvenOddd evenOdd=new EvenOddd(){
				public void check(double a) {
					if(a%2==0){
						System.out.println("number " +a+ " :is even");
					}
					else{
						System.out.println("number " +a+ " :is odd");
					}
				}
			};
			
				evenOdd.check(a);
				
		}
}
