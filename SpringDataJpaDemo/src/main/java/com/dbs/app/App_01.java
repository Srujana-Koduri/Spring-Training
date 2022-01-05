package com.dbs.app;

import com.dbs.entities.Employee;
import com.dbs.exceptions.InvalidEmployeeIdException;
import com.dbs.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService employeeService = ctxt.getBean(EmployeeService.class);
        Employee emp1 = new Employee(2,"Vijay", 1);
        System.out.println(employeeService.save(emp1));
//        Employee emp1 = new Employee("Ajay", 1);
//        employeeService.save(emp1);
//         Employee emp1 = new Employee(1,"Vikram", 2);
//         employeeService.save(emp1);
//        try {
//            employeeService.delete(101);
//        } catch (InvalidEmployeeIdException e) {
//            e.printStackTrace();
//        }
        System.out.println(employeeService.findAll());

    }
}
