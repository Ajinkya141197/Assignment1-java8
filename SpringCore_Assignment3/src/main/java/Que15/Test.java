package Que15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("Que15/que15.xml");
		Customer c = (Customer) obj.getBean("testCustomer3");
		System.out.println(c);
		
	}
}
