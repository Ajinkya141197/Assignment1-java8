package Que4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrintDetails {
	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<Employee>();
		ApplicationContext objAC = new ClassPathXmlApplicationContext("Que4/que4.xml");
		
		Employee e1 = (Employee) objAC.getBean("emp1");
		Employee e2 = (Employee) objAC.getBean("emp2");
		
		
		list.add(e1);
		list.add(e2);
		
		List<Employee> slist=list.stream().sorted((s1,s2) ->Double.compare(e1.geteSalary(),e2.geteSalary())).collect(Collectors.toList());
		      
		for(Employee emp : slist)
		{
			System.out.println(emp.toString());
		}
	}
}
