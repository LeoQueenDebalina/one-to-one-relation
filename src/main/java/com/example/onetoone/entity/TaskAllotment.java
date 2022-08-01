package com.example.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TaskAllotment")
public class TaskAllotment {
    @Id
    @Column(name="taskAllotmentId",length = 100)
    private String taskAllotmentId;
    @Column(name="ranking",length = 100)
    private String ranking;
    @Column(name="feedback",length = 100)
    private String feedback;
    @Column(name="status",length = 100)
    private String status;
    @Column(name="startDate",length = 100)
    private String startDate;
    @Column(name="endDate",length = 100)
    private String endDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeId", referencedColumnName = "employeeId")
    private Employee employee;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "taskId", referencedColumnName = "taskId")
    private Task task;
}
