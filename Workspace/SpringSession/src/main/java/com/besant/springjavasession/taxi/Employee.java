package com.besant.springjavasession.taxi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	   @Qualifier("student1")
	   private Student student;

	    @Autowired 
	    public void setHeart(Student student)
	    {
	        this.student = student;
	    }
	 
	    // Method
	    // Calling method of Heart class
	    public void startPumping() 
	    { 
	    	student.pump(); }
	  
}
