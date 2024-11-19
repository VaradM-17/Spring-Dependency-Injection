package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	private int eid;
	@Value("Vam")
	private String ename;

	@Autowired
	Country country;
	
	
	

	public int getEid() {
		return eid;
	}




	public void setEid(int eid) {
		this.eid = eid;
	}




	public String getEname() {
		return ename;
	}




	public void setEname(String ename) {
		this.ename = ename;
	}




	public Country getCountry() {
		return country;
	}




	public void setCountry(Country country) {
		this.country = country;
	}




	



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", country=" + country + "]";
	}

}
