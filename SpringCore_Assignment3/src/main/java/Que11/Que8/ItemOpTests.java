package Que8;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemOpTests {
	public static void main(String[] args) {
		ApplicationContext obj=new ClassPathXmlApplicationContext("Que8/que8.xml");
		Item i=(Item) obj.getBean("itemList");
		System.out.println("Original List:\n"+i.ItemName);
		
		List<Object>sortedList=i.ItemName.stream().sorted().collect(Collectors.toList()); 
		System.out.println("Sorted List:\n"+sortedList);
		
		 Set<Object>names=i.ItemName.stream().collect(Collectors.toSet());
		 System.out.println("List Without Duplicates:\n"+names);
	}

}
