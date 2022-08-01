package com.example.onetoone.service;

import com.example.onetoone.entity.*;
import com.example.onetoone.repository.TaskAllotmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskAllotmentService {
    @Autowired
    private TaskAllotmentRepository taskAllotmentRepository;
    private final Logger logger = LoggerFactory.getLogger(TaskAllotmentService.class);
    public List<TaskAllotment> getAll(){
        logger.error("hi");
        return this.taskAllotmentRepository.findAll();
    }
    public TaskAllotment getById(String id){
        Optional<TaskAllotment> ts = this.taskAllotmentRepository.findById(id);
        if (ts.isPresent()){
            return ts.get();
        }else {
            return null;
        }
    }
     public TaskAllotment saveAll(TaskAllotment taskAllotment){
        logger.error("hi");
        // TaskAllotment data = new TaskAllotment("101","9","Good","Done","Jan","June", new Employee("I-97","Debalina Das","8420128890","101,thakurgoli,chucura","712101","Jan","June","Active", new Designation("123","Java developer")), new Task("90","create employee database", new Project("07","Employee management System")));
         return this.taskAllotmentRepository.save(taskAllotment);
    }
    public TaskAllotment update(TaskAllotment taskAllotment){

        return this.taskAllotmentRepository.save(taskAllotment);
    }

    public void deleteById(String id){
        this.taskAllotmentRepository.deleteById(id);
    }

}
