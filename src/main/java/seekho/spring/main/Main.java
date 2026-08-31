package seekho.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import seekho.spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new AnnotationConfigApplicationContext("seekho.spring");
		
		Employee bean1 = ioc.getBean("employee",Employee.class);
		System.out.println(bean1);
		
	}

}
