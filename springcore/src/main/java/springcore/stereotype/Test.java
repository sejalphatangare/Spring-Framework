package springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springcore/stereotype/stereoconfig.xml");
		Student student=context.getBean("ob",Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		
//		singleton scope:  @Component
//						  @scope  <-- bydefault singleton
		
		
//		pprototype scope:  @Component 
//		                   @scope("prototype")

		System.out.println(student.hashCode());
		Student student1=context.getBean("ob",Student.class);
		System.out.println(student1.hashCode());
		
		Teacher t1=context.getBean("teacher",Teacher.class);
		Teacher t2=context.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
