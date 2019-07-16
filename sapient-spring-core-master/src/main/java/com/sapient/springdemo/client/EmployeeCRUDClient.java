package com.sapient.springdemo.client;

import com.sapient.springdemo.model.Employee;
import com.sapient.springdemo.service.EmployeeService;

//import java.util.List;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeCRUDClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        //Java configuration
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean("employeeService" ,EmployeeService.class);
//        Employee pavan = new Employee(23, "Pavan");
//        employeeService.saveEmployee(pavan);
//        List<Employee> e1 = employeeService.fetchAllEmployees();
        
        System.out.println("hiiii");
        Employee e1 = employeeService.findById(1);
        System.out.println(e1);
//      Employee
    
        employeeService.deleteEmployee(23);
//        for(Employee e : e1 ) {
//        	System.out.println(e);
//        }
        
        //e1.forEach((n) -> System.out.println(n)); 
    }
}