package com.example.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Task")
public class Task {
    @Id
    @Column(name="taskId",length = 100)
    private String taskId;
    @Column(name="taskDescription",length = 100)
    private String  taskDescription;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projectId", referencedColumnName = "projectId")
    private Project project;
}
