package com.viraj.sample.entity;


import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column(name = "EMPLOYEE_DESCRIPTION")
    private String employeeDescription;
    
    @Column(name="EMPLOYEE_DETAILS")
    private String employeeDetails;

    public Employee() {
    }

    public Employee(String employeeName, String employeeDescription) {
        this.employeeName = employeeName;
        this.employeeDescription = employeeDescription;
    }
    
    public long getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public String getEmployeeDescription() {
        return employeeDescription;
    }
    
    public void setEmployeeDescription(String employeeDescription) {
        this.employeeDescription = employeeDescription;
    }
    
    public String getEmployeeDetails() {
        return employeeDetails;
    }
    
    public void setEmployeeDetails(String employeeDetails) {
        this.employeeDetails = employeeDetails;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDescription='" + employeeDescription + '\'' +
                '}';
    }
}
