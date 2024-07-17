package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FacultySubject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int subid;
	String subjectName;
	

	public FacultySubject() {
		super();
		
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public FacultySubject(String subjectName) {
		super();
		this.subjectName = subjectName;
		
	}

	
	@Override
	public String toString() {
		return "FacultySubject [subid=" + subid + ", subjectName=" + subjectName + "]";
	}
	

}
