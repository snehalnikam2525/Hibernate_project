package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int fid;
	String fname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fid")
	List<FacultySubject> fsubList;

	public Faculty() {
		super();
		
	}

	public Faculty(String fname) {
		super();
		this.fname = fname;
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public List<FacultySubject> getFsubList() {
		return fsubList;
	}

	public void setFsubList(List<FacultySubject> fsubList) {
		this.fsubList = fsubList;
	}
	
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", fsubList=" + fsubList + "]";
	}

	
}
