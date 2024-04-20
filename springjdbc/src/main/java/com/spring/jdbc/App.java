package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
////        insert query
//        String query="insert into student(id,name,city) values(?,?,?)";
//        
////        fire the query
//        int result=template.update(query,457,"jane williams","new york");
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = new Student();
        student.setId(666);
        student.setName("Manish Singh");
        student.setCity("Punjab");
        
        int result=studentDao.insert(student);
        System.out.println("Student Added: "+result);
        
    }
}
