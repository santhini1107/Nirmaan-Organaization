package com.nirmaan.School.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmaan.School.entity.StdEntity;
import com.nirmaan.School.services.StdService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("student")
public class StdController {
	@Autowired
	StdService service;
	 
	@PostMapping("post")
	public String postMethodName(@RequestBody StdEntity std) {
		//TODO: process POST request
		return service.postMap(std);
	}
	@GetMapping("getall")
	public List<StdEntity> getMethodName() {
		return service.getAll();
	}
	@GetMapping("getbyid/{id}")
	public StdEntity getMethodName(@PathVariable int id) {
		return service.getById(id);
	}
	@GetMapping("getbyname/{name}")
	public StdEntity getMethodName(@PathVariable String name) {
		return service.getByName(name);
	}
	@PutMapping("put/{id}")
	public String putMethodName(@PathVariable int id, @RequestBody StdEntity std) {
		//TODO: process PUT request
		
		return service.putMap(id, std) ;
	}
	@DeleteMapping("delete/{id}")
	public String deleteMethod(@PathVariable int id) {
		return service.deleteMap(id);
	}
	
	
	
}
