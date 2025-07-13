package com.example.failure_analyzer_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Failure {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String rootCause;
    private String lessonLearned;
    
    
    
       public Failure() {
	
	    }
   public Failure(Long id, String title, String description, String rootCause, String lessonLearned) {
 		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.rootCause = rootCause;
		this.lessonLearned = lessonLearned;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRootCause() {
		return rootCause;
	}
	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}
	public String getLessonLearned() {
		return lessonLearned;
	}
	public void setLessonLearned(String lessonLearned) {
		this.lessonLearned = lessonLearned;
	}
    
    
    
	

}
