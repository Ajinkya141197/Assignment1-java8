package Que5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMaxNum {
	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("Que5/que5.xml");
		Numbers cls = (Numbers) obj.getBean("checkMax");
		
	 cls.findMaximumNumber();
	 System.out.println(cls.num);

	}
}
