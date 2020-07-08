package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.POJO.Profile;
import com.POJO.Requirment;
import com.repository.DatabaseRepository;
import com.repository.ProfileRepository;

@Service
public class DBService {

	@Autowired
	private DatabaseRepository dbRepo;
	
	@Autowired
	private ProfileRepository proRepo;
	
	public void addRequirment(Requirment requirment) {
		requirment.setActive(1);
		dbRepo.save(requirment);
		System.out.println("Saved!");
	}
	
	public List<Requirment> getAllRequirments(){
		
		return dbRepo.findByActive(1);
	}

	public void deleteRequirment(int  id) {
		
		//dbRepo.deleteById(id);
		Requirment requirment = dbRepo.findById(id);
		requirment.setActive(0);
		dbRepo.save(requirment);
	}

	public void addProfile(Profile profile) {
		
		proRepo.save(profile);
	}

	public List<Profile> getProfiles(Requirment requirment) {
		return proRepo.findAllByRequirment(requirment);
	}

}
