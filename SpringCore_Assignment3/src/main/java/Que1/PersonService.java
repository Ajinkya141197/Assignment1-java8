package Que1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonService {
//	public static void main (String [] args) {
//	CompanyFactory companyFactory =new CompanyFactory();
//	Person person = companyFactory.ShowTypeOfPerson("admin");
//	person.typeOfPerson();
//	}
	
	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("Que1/que1.xml");
		CompanyFactory a =(CompanyFactory) obj.getBean("companyFactory");
		Person p = a.ShowTypeOfPerson("admin");
		p.typeOfPerson();
	}
}
