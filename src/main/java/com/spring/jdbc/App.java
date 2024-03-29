package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Project Stared...........!" );
        // spring JDBC=> JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student=new Student();
        student.setId(101);
        student.setName("Mohan");
        student.setCity("Chennai");
        int result = studentDao.insert(student);
        System.out.println("number of record inserted.."+result);
        
        
        
        
        
        //JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
       // String query="insert into student(id,name,city)values(?,?,?)";
        
        //fire the query
       // int result = template.update(query,457,"Harsh  Singh","Mumbai");
       // System.out.println("number of record inserted.."+result);
    }
}
