package com.besant.springjavasession;


public class Employee {

	private String empName;

	private Address address;

	public Employee() {
		super();
	}

	
	

	public Employee(String empName, Address address) {
		super();
		this.empName = empName;
		this.setAddress(address);
	}




	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}

	
}
