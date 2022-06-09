package com.example.ExamMicroservices.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="Employee_Worked_Hours")
public class Employee_Worked_Hours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer Worked_Hours;

    @Column(nullable = false)
    private Date Worked_Date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Employee_id")
    @JsonProperty(access = Access.WRITE_ONLY)
    private Employee employee;

    public Employee_Worked_Hours(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWorked_Hours() {
        return Worked_Hours;
    }

    public void setWorked_Hours(Integer worked_Hours) {
        Worked_Hours = worked_Hours;
    }

    public Date getWorked_Date() {
        return Worked_Date;
    }

    public void setWorked_Date(Date worked_Date) {
        Worked_Date = worked_Date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    

}
