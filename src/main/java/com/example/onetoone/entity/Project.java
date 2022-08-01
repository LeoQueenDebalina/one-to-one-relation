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
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Project")
public class Project {
    @Id
    @Column(name="projectId",length = 100)
    private String projectId;
    @Column(name="projectName",length = 100)
    private String projectName;
}
