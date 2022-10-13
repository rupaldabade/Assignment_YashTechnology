package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.sevice.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
        StudentService ss = context.getBean(StudentService.class);
        ss.admit();//call method
        ss.totalStudent(500);
    }
}
