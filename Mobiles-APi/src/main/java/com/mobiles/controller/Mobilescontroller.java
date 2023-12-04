package com.mobiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiles.Entity.Mobiles;
import com.mobiles.Repo.MobilesRepositry;

@RestController
public class Mobilescontroller {
	
	// DI
	@Autowired
	MobilesRepositry mobilesRepo;
	
	@PostMapping("/mobile")
	public Mobiles createmobile(@RequestBody Mobiles mobiles) 
	{
		
		Mobiles mobile=mobilesRepo.save(mobiles);
		return mobile;
		
	}
	
	@PostMapping("/multipleMobiles")
	public List<Mobiles> createMultiplemobiles(@RequestBody List<Mobiles> mobiles)
	{
		List<Mobiles> listmobiles= mobilesRepo.saveAll(mobiles);
		return listmobiles;
	}
	
	@GetMapping("/getsinglemobile/{id}")
    public Mobiles getmobile(@PathVariable int id) 
	{
		Mobiles mobileget= mobilesRepo.findById(id).get();
		return mobileget;
		
	}
	
	@GetMapping("/getmultiplemobiles")
	public List<Mobiles> getmultiplemobiles()
	{
		List<Mobiles> mobialgetall=mobilesRepo.findAll();
		return mobialgetall;	
		}
	@PutMapping("/updatemobiles/{id}")
	public Mobiles updatemobiles(@PathVariable int id, @RequestBody Mobiles mobiles) 
	{
		Mobiles mobilesupdate= mobilesRepo.findById(id).get();
		mobilesupdate.setColour(mobilesupdate.getColour());
		mobilesupdate.setModal(mobilesupdate.getModal());
		mobilesupdate.setPrice(mobilesupdate.getPrice());
		return mobilesupdate;
	}
	
	@DeleteMapping("/deletemobiles{id}")
	public void deletemobiles(@PathVariable int id) 
	{
		Mobiles mobiledelete=mobilesRepo.findById(id).get();
		
		mobilesRepo.delete(mobiledelete);
	}
	
}
