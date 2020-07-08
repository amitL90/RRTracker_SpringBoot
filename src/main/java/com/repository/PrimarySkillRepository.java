package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POJO.PrimarySkills;
@Repository
public interface PrimarySkillRepository extends JpaRepository<PrimarySkills, Integer> {

}
