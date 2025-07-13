package com.example.failure_analyzer_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.failure_analyzer_project.entity.Failure;
import com.example.failure_analyzer_project.repository.FailureRepository;

@Service
public class FailureService {
	
	 @Autowired
     private FailureRepository failureRepository;
    
	 
	 //Creation Of Failure Record
	    public Failure createFailureRecord(Failure failure) {
		  Failure createdFailureRecord = failureRepository.save(failure);
           return  createdFailureRecord; 
		 }
	
	
	
	

}
