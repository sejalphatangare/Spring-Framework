package com.Hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
//        creating student 
        Student st=new Student();
        st.setId(102);
        st.setName("Sejal Phatangare");
        st.setCity("Khopoli");
        System.out.println(st);
        
        
//        creating object of Address Class
        Address ad=new Address();
        ad.setStreet("street1");
        ad.setCity("Delhi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(105.2);
        
//        Reading Image
        FileInputStream fis=new FileInputStream("src/main/java/Chocolate-Brownie-Recipe-5.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session= factory.openSession();
        
        //session.beginTransaction();  //start transaction
        
        Transaction tx=session.beginTransaction();
        session.save(st);  //save the object
        session.save(ad);
        
        
        //session.getTransaction().commit();   //get transaction ko commit karo
        tx.commit();
        session.close();
        System.out.println("Done..");
        
//        System.out.println(factory.isClosed());
        
        
    }
}
