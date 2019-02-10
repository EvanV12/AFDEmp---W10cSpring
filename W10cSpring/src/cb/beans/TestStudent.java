package cb.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	//public TestCustomer() {}

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student cust=(Student) context.getBean("eng_stud_newest");
        System.out.println(cust.toString());
        
        Student cust2=(Student) context.getBean("eng_stud_newest");
        System.out.println(cust2.toString());
        
        
        System.out.println("\n"+cust.toString());
        System.out.println(cust2.toString());

	}

}
