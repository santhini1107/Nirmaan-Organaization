package com.nirmaan.School.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nirmaan.School.entity.StdEntity;

@Service
public interface IStdService {
	String postMap(StdEntity std);
	List<StdEntity> getAll();
	StdEntity getById(int id);
	StdEntity getByName(String name);
	String putMap(int id,StdEntity std);
	String deleteMap(int id);
}
