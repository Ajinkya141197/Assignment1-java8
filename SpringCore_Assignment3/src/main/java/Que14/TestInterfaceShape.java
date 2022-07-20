package Que14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestInterfaceShape {
public static void main(String[] args) {
	ApplicationContext obj = new ClassPathXmlApplicationContext("Que14/que14.xml");
	Circle c = (Circle) obj.getBean("TestShape");
	Square s = (Square) obj.getBean("TestShape1");
	Rectangle r = (Rectangle) obj.getBean("TestShape2");

System.out.println("Please Enter Choice:\n 1:Find Area of Circle.\n 2.Find Area of Square.\n 3.Find Area of Rectangle.");

	while(true) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter choice:\n");
	String ch = sc.next();
	switch (ch) {
	case "1":
		System.out.println("Please enter radius: ");
		int x=sc.nextInt();
		c.area(x);
		c.side();
		break;
	case "2":
		s.area(5);
		s.side();
		break;
	case "3":
		r.area(2, 4);
		r.side();
		break;
		default: System.out.println("Enter valid Choice");
	}
}
}
}
