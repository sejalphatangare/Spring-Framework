package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started!" );
//        spring jdbc => JdbcTemplate
//  ---> after using Connfig.xml bean file ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//   -->without using bean xml file-->
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
////        insert query
//        String query="insert into student(id,name,city) values(?,?,?)";
//        
////        fire the query
//        int result=template.update(query,457,"jane williams","new york");
        
//        INSERT
//        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        Student student = new Student();
//        student.setId(6668);
//        student.setName("Manish Singh");
//        student.setCity("Punjab");
//        
//        int result=studentDao.insert(student);
//        System.out.println("Student Added: "+result);
//        
        
//        UPDATE
//        Student student = new Student();
//        student.setId(457);
//        student.setName("Raj Kumar");
//        student.setCity("Hyderabad");
//        
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        int result=studentDao.change(student);
//        System.out.println("Data Changed "+result);
        
//        DELETE
//        Student student=new Student();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Student Id to be deleted: ");
//        int studentId=sc.nextInt();
//        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        int result=studentDao.delete(studentId);
//        System.out.println("Deleted "+result);
        
//        Student student=studentDao.getStudent(222);
//        System.out.println(student);
        
        List<Student> students=studentDao.getAllStudents();
        for (Student s : students) {
			System.out.println(s);
		}
    }
}
