package Que3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEMITest {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		ApplicationContext obj = new ClassPathXmlApplicationContext("Que3/que3.xml");

		EMI a = (EMI) obj.getBean("emi");
		System.out.println("Please enter years  :");
		a.t=sc.nextInt();
		a.calEMI();
		
	}

}
