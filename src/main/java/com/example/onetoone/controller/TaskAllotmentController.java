package com.example.onetoone.controller;

import com.example.onetoone.entity.TaskAllotment;
import com.example.onetoone.service.TaskAllotmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskAllotmentController {
    @Autowired
    private TaskAllotmentService taskAllotmentService;

    @GetMapping("/getAll")
    public List<TaskAllotment> getAll(){
        return this.taskAllotmentService.getAll();
    }
    @GetMapping("/get/{id}")
    public TaskAllotment getById(@PathVariable String id){
        return this.taskAllotmentService.getById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody TaskAllotment taskAllotment){
        this.taskAllotmentService.saveAll(taskAllotment);
    }
    @PutMapping("/save")
    public void update(@RequestBody TaskAllotment taskAllotment){
        this.taskAllotmentService.update(taskAllotment);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable String id){
        try{
            this.taskAllotmentService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
