package Que9;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DistanceTest {
	public static void main(String[] args)
	{
       
        ApplicationContext objAC = new ClassPathXmlApplicationContext("Que9/que9.xml");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter city name first : ");
        String str1 = sc.next();
        
        System.out.print("Enter city name second : ");
        String str2 = sc.next();
        
        String str12 = str1.concat("-").concat(str2);
        
        Distance d = objAC.getBean(str12, Distance.class);
       
        System.out.println("Distance between "+str1+" and "+str2+" is "+d.distance);

    
    }
}
