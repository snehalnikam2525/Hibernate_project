package com.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	int pid;
	String pname;
	int sal;
	String city;
	
	public Person() {
		super();
		
	}

	public Person(int pid, String pname, int sal, String city) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.sal = sal;
		this.city = city;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", sal=" + sal + ", city=" + city + "]";
	}
	
	
	
	
	
	

}
