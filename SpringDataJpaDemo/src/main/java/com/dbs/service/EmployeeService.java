package com.dbs.service;

import com.dbs.entities.Employee;
import com.dbs.exceptions.InvalidEmployeeIdException;
import com.dbs.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;

@Component
public class EmployeeService {


    EmployeeRepo employeeRepo;

    public EmployeeRepo getEmployeeRepo() {
        return employeeRepo;
    }

    @Autowired
    public void setEmployeeRepo(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee find(int id) throws InvalidEmployeeIdException{
        Optional<Employee> empOpt = employeeRepo.findById(id);
        if(!empOpt.isPresent())
            throw new InvalidEmployeeIdException("Employee Id not found: " + id);
        return empOpt.get();
    }

    public List<Employee> findAll(){
        return (List<Employee>) employeeRepo.findAll();
    }

    public Employee save(Employee employee) {

        return (Employee) employeeRepo.save(employee);
    }

    public Employee edit(Employee employee) throws InvalidEmployeeIdException{
        find(employee.getId());
        return (Employee) employeeRepo.save(employee);
    }
    public Employee delete(int id) throws InvalidEmployeeIdException{
        Employee employee = find(id);
        employeeRepo.deleteById(id);
        return employee;
    }
}
