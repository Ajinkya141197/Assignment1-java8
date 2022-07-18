package Que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AvgNumTest {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("Que2/que2.xml");
		BeanCls obj=(BeanCls) con.getBean("num");
		obj.avg();
		obj.avg2();
	}
}
