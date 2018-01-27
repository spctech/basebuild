package com.smp.web.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.smp.web.entity.*;

@RepositoryRestResource
public interface TaskDAO extends CrudRepository<Task, Integer> {
	//@PersistenceContext	
	//public EntityManager entityManager;	
 //List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
// List<Task> findByTaskStatus(@Param("status") String taskStatus);
// List<Task> findAll();
// long count();
 
}