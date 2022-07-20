package Que7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayOpTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Que7/que7.xml");
        Array1 obj=(Array1) ctx.getBean("array2");
    
        obj.merge();
	}

}
