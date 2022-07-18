package Que12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SalaryOp {
	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("Que12/que12.xml");
		List<Employee> list=new ArrayList<>();
		Employee em = (Employee) obj.getBean("empl");
		Employee em1 = (Employee) obj.getBean("empl1");
		list.add(em1);
		list.add(em);
		Employee maxs =list.stream().max((s1 ,s2) ->s1.getSalary() >s2.getSalary() ? 1:-1).get();
		System.out.println("Maximum Salary Department name :"+maxs.getDep());
		System.out.println("Employee having Highest Salary :"+maxs.getName());
		
		
		Double average=list.stream().collect(Collectors.averagingDouble(e ->e.getSalary()));
		List <Employee> avgminimum=list.stream().filter(m ->m.getSalary()<average).collect(Collectors.toList());
		System.out.println("Employee Having Salary Less Than or Equal to Average Salary");
		for(Employee e:avgminimum) {
			System.out.println(e.getName()+ " "+e.getSalary());
			}
		
		
		List<String> depart=list.stream().map(r ->r.getDep()).distinct().collect(Collectors.toList());
		for (String dept:depart) {
			Double avg=list.stream().filter(a ->a.getDep().equals(dept)).collect(Collectors.averagingDouble(d ->d.getSalary()));
			System.out.println("Average Salary in Each Department : \n Average Salary:"+average+ "Department:"+dept);
				}
		}
}