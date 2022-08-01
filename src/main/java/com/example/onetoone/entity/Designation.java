package com.example.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Designation")
public class Designation {
    @Id
    @Column(name="designationId",length=100)
    private String designationId;
    @Column(name="designatedAs",length=100)
    private String designatedAs;
}
