package com.sapient.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapient.springdemo.model.Employee;
import com.sapient.springdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class RegisterController {
	
	@Autowired
	private EmployeeService employeeService;

    @GetMapping("/logdfgdfgin")
    public String login(){
        return "login";
    }
    
    @GetMapping("/show")
    public String show(Model model){
         //Employee pavan = new Employee(8, "n");
         //employeeService.saveEmployee(pavan);
         List<Employee> e1 = employeeService.fetchAllEmployees();
         model.addAttribute("e1",e1);
       for(Employee e : e1 ) {
     	System.out.println(e);
     }
//     
//         System.out.println("hiiii");
//         Employee e1 = employeeService.findById(1);
//         System.out.println(e1);
////       Employee
//     
//         employeeService.deleteEmployee(23);
    	return "show";
   
    }
    
    
    @PostMapping("/register")
    public String register(Model model, @ModelAttribute Employee employee){
    	employeeService.saveEmployee(employee);
    	return "success";
   
    }
    
    
    @GetMapping("/{id}")
    public String displayEmployee(@PathVariable("id") int id,Model model){
    	Employee e = employeeService.findById(id);
    	model.addAttribute("emp",e);
    	
    	return "employee";
   
    }
    
    
    
    
    
}