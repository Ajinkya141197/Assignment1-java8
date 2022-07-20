package Que10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentOpTest {
	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("Que10/que10.xml");
		Student a = (Student) obj.getBean("std");
			a.show();
			a.studentCheck();
	}

}
