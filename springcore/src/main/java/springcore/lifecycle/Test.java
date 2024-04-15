package springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springcore/lifecycle/config.xml");
		Samosa s1=(Samosa) context.getBean("s1");
        //how to enable hook
		//registering shutdown hook
		context.registerShutdownHook();
		System.out.println(s1);

		
		
		System.out.println("++++++++++++++++++++++++++++++++");
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		context.registerShutdownHook();
		
		
	}

}
