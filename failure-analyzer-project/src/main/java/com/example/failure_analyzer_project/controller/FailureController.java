package com.example.failure_analyzer_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.failure_analyzer_project.entity.Failure;
import com.example.failure_analyzer_project.service.FailureService;

@RestController
@RequestMapping("/failure")
public class FailureController { 
	
	@Autowired
	private FailureService failureService;
	
	@PostMapping
	public ResponseEntity createFailureRecords(@RequestBody Failure failure) {
		Failure craetedfailureRecord =  failureService.createFailureRecord(failure);
	    return new ResponseEntity<>(craetedfailureRecord,HttpStatus.CREATED);
	}

}
