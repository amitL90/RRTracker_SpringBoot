package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.POJO.DeliveryManager;
import com.POJO.Location;
import com.POJO.Portfolio;
import com.POJO.PracticeUnit;
import com.POJO.PrimarySkills;
import com.repository.DeliveryManagerRepository;
import com.repository.LocationRepository;
import com.repository.PortfolioRepository;
import com.repository.PracticeUnitRepository;
import com.repository.PrimarySkillRepository;

@Service
public class RequestDropDwonService {
	
	@Autowired
	private DeliveryManagerRepository deliverymgrrepo;
	
	@Autowired
	private PortfolioRepository portfoliorepo;
	
	@Autowired
	private PrimarySkillRepository primarypkillrepository;
	
	@Autowired
	private PracticeUnitRepository practiceUnitrepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	public List<DeliveryManager> getDeliveryManger(){
		
		return deliverymgrrepo.findAll();
	}
	
public List<Portfolio> getPortfolio(){
		
		return portfoliorepo.findAll();
	}

public List<PrimarySkills> getPrimarySkill(){
	
	return primarypkillrepository.findAll();
}

public List<PracticeUnit> getPracticeUnit(){
	
	return practiceUnitrepository.findAll();
}

public List<Location> getAllLocations(){
	return locationRepository.findAll();
}
}
