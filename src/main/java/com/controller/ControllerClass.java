package com.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.POJO.DeliveryManager;
import com.POJO.DropDownPojo;
import com.POJO.Profile;
import com.POJO.Requirment;
import com.repository.DatabaseRepository;
import com.service.DBService;
import com.service.RequestDropDwonService;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ControllerClass {

	@Autowired
private	DBService dbservice;
	
	@Autowired
	private RequestDropDwonService dropdownservice;
	
	@PostMapping("/inserData")
	public String addData(@RequestBody Requirment requirment) {
		System.out.println(requirment);
		dbservice.addRequirment(requirment);
		return "Record has been saved successfully";
		
	}
	
	@GetMapping("/getAllRequirements")
	public List<Requirment> getData() {
		
		return dbservice.getAllRequirments();
	}
	@GetMapping("/dropdowndata")
	public List<DropDownPojo> getDropDownDataOfRequest() { 
		List<DropDownPojo> drpdList=new ArrayList<DropDownPojo>();
		DropDownPojo dropojo=new DropDownPojo();
		
		dropojo.setDeliverymanager(dropdownservice.getDeliveryManger());
		dropojo.setPortfolio(dropdownservice.getPortfolio());
		dropojo.setPrimarySkill(dropdownservice.getPrimarySkill());
		dropojo.setPracticeUnit(dropdownservice.getPracticeUnit());
		dropojo.setLocations(dropdownservice.getAllLocations());
		
		drpdList.add(dropojo);
		return drpdList;
		
	}
	
	@DeleteMapping("/deleteRequirement/{id}")
	public String deleteRequirment(@PathVariable String id) {
		System.out.println(id);
		int intID=Integer.parseInt(id);
		dbservice.deleteRequirment(intID);
		return "Deleted Requirment";
	}
	
	@PostMapping ("/addProfile")
	public String addProfileForRequest(@RequestBody Profile profile) {
		
		System.out.println(profile);
		dbservice.addProfile(profile);
		
		return "Profile added successfully";
	}
	
	
	@GetMapping("/getProfile/{id}")
	public List<Profile> getAllProfileForReq(@PathVariable int id) {
		System.out.println("id= " + id);
		Requirment requirment = new Requirment();
		requirment.setRequestID(id);
		List<Profile> list = dbservice.getProfiles(requirment);
		return list;
	}
	
	
}
