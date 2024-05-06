package com.Hibernate;

import javax.persistence.metamodel.EntityType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
//  get,load
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
//		get-student:106
		Student student=session.get(Student.class,102);
		System.out.println(student);
		
		Address ad1=session.load(Address.class, 1);
		System.out.println(ad1.getStreet());
		System.out.println(ad1);
		
		session.close();
		factory.close();
		
	}
	
	
	
	
}
