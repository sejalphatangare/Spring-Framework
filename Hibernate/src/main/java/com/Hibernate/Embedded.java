package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Embedded {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student student1=new Student();
		student1.setId(123);
		student1.setName("ankit tiwari");
		student1.setCity("Lucknow");
		
		Certificate certi=new Certificate();
		certi.setCourse("Android");
		certi.setDuration("2 months");
		
		student1.setCerti(certi);
		
		Student student2=new Student();
		student2.setId(124);
		student2.setName("Tejal patil");
		student2.setCity("Pune");
		
		Certificate certi2=new Certificate();
		certi2.setCourse("Python");
		certi2.setDuration("1 months");
		
		student2.setCerti(certi2);
		
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(student1);
		s.save(student2);
		tx.commit();
		s.close();
		factory.close();
	}
}
