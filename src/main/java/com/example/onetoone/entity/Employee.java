package com.example.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name="employeeId",length=100)
    private String employeeId;
    @Column(name="name",length=100)
    private String name;
    @Column(name="contact",length=100)
    private String contact;
    @Column(name="address",length=100)
    private String address;
    @Column(name="postalCode",length=100)
    private String postalCode;
    @Column(name="startDate",length=100)
    private String startDate;
    @Column(name="endDate",length=100)
    private String endDate;
    @Column(name="status",length=100)
    private String status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="designationId",referencedColumnName = "designationId")
    private Designation designation;

}
