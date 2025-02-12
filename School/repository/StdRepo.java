package com.nirmaan.School.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmaan.School.entity.StdEntity;

public interface StdRepo extends JpaRepository<StdEntity, Integer> {

	StdEntity findByName(String name); 
}
