package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POJO.Profile;
import com.POJO.Requirment;
@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

	/*
	 * @Query("SELECT p FROM Profile p WHERE p.requirment.requestID=:id")
	 * List<Profile> findAllByRequestID(int id);
	 */
	List<Profile> findAllByRequirment(Requirment requirment);
}
