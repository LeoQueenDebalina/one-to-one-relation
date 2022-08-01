package com.example.onetoone.repository;

import com.example.onetoone.entity.TaskAllotment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskAllotmentRepository extends JpaRepository<TaskAllotment,String> {


}
