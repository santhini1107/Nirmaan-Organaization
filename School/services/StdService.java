package com.nirmaan.School.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.School.entity.StdEntity;
import com.nirmaan.School.repository.StdRepo;
@Service
public class StdService implements IStdService {
	
	@Autowired
	StdRepo repo;
	
	@Override
	public String postMap(StdEntity std) {
		// TODO Auto-generated method stub
		repo.save(std);
		return "success" ;
	}

	@Override
	public List<StdEntity> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public StdEntity getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public StdEntity getByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	@Override
	public String putMap(int id, StdEntity std) {
		// TODO Auto-generated method stub
		
		std.setId(id);
		repo.save(std);
		return "updated";
	}

	@Override
	public String deleteMap(int id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
		return "Deleted" ;
	}

}
