package Que11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Result_Op_test {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Que11/que11.xml");
		Student stud1=(Student) ctx.getBean("stud1");
     	Student stud2=(Student) ctx.getBean("stud2");
	    Student stud3=(Student) ctx.getBean("stud3");
	    Student stud4=(Student) ctx.getBean("stud4");
	    Student stud5=(Student) ctx.getBean("stud5");
		list.add(stud1);
	    list.add(stud2);
	    list.add(stud3);
		list.add(stud4);
		list.add(stud5);
		
		for (Student stu:list) {
			System.out.println(stu.studentname+ ": "+stu.obj.totalMarks);
		}
		
		List<Student> sortlist=list.stream().sorted((s1,s2) ->Float.compare(s1.obj.totalMarks, s2.obj.totalMarks)).collect(Collectors.toList());
		System.out.println("Sorted list of Students as per total Marks");
		
		for(Student stu:sortlist) {
			System.out.println(stu.studentname+ ": "+stu.obj.totalMarks);
		}
		
		
	}

}
