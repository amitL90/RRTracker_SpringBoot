package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POJO.Requirment;


@Repository
public interface DatabaseRepository extends JpaRepository<Requirment, Integer> {
	List<Requirment> findByActive(Integer activeFlag);
	
	Requirment findById(int id);
	
}
