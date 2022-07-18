package Que6;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NameDivision {
	public static void main(String[] args) {
		ArrayList<String> fname= new  ArrayList<>();
		ArrayList<String> noVowel= new ArrayList<String>();
		String[] arrOfStr = null;
		ApplicationContext obj = new ClassPathXmlApplicationContext("Que6/que6.xml");
		NameBean n= (NameBean) obj.getBean("enames");
		for(String name : n.names) {
			String firstName=name.split(" ")[name.split(" ").length-2];
		//	arrOfStr = name.split(" ");
		    fname.add(firstName);
		    
		
		  for (int i = 0; i < fname.size(); i++)
	        {	int number=0;
	            if (fname.get(i).contains("a") || fname.get(i).contains("e") || fname.get(i).contains("i") ||fname.get(i).contains("o") || fname.get(i).contains("u"))
	            {
	                number++;
	            }else {
	            	
	            	noVowel.add(firstName);
            }
        }
	}
//        for (String a : arrOfStr) {
//            System.out.println(a);
//    }
		
		System.out.println("First name list "+fname);
		System.out.println("No Vowel list  "+noVowel);
	}
}
