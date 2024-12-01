package com.viraj.sample.entity;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class EmployeeCriterria implements Specification<Employee> {
    private String address;
    private String address2;
    @Override
    public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        Predicate addressPredicate = null;
        Predicate addressPredicate2 = null;
        if (address != null) {
            addressPredicate = cb.equal(
                    cb.function("JSON_VALUE", String.class, root.get("employeeDetails"), cb.literal("$.address")),
                    cb.literal(address)
            );
        }
        if (address2 != null) {
            addressPredicate2 = cb.equal(
                    cb.function("JSON_VALUE", String.class, root.get("employeeDetails"), cb.literal("$.address2")),
                    cb.literal(address2)
            );
        }
        
        
        return cb.and(addressPredicate, addressPredicate2);
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress2() {
        return address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
}
