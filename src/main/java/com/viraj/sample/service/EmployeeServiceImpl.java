package com.viraj.sample.service;

import com.viraj.sample.entity.Employee;
import com.viraj.sample.entity.EmployeeCriterria;
import com.viraj.sample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    @Override
    public List<Employee> getAllEmployees(String address, String address2) {
        EmployeeCriterria employeeCriterria = new EmployeeCriterria();
        employeeCriterria.setAddress(address);
        employeeCriterria.setAddress2(address2);
        Specification<Employee> spec = Specification.where(employeeCriterria);
        return (List<Employee>) employeeRepository.findAll(spec);
    }

    @Override
    public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
