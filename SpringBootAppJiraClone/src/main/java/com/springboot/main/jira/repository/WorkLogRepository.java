package com.springboot.main.jira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.main.jira.model.WorkLog;

public interface WorkLogRepository extends JpaRepository<WorkLog, Integer>{

	List<WorkLog> findByEmployeeId(int eid);
	
	
	
	
	@Query("select w from WorkLog w where w.task.id=?1 ")
	List<WorkLog> getWorkLogByTaskId(int taskId);

}