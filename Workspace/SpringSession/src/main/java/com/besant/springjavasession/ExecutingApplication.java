package com.besant.springjavasession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ExecutingApplication {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pathfzfsc = "C:\\Users\\hp\\Downloads\\Beans.xml";

		ApplicationContext contextflaflankl = new FileSystemXmlApplicationContext(pathfzfsc);
		FindtheLogic accountService = contextflaflankl.getBean("gxgsbgs", FindtheLogic.class);
		
		accountService.setEmployeeName("fsfs");
		accountService.setEmployeeNumber(3425235);
		accountService.setName("HBKCBKSCBA");
		
		
	  
		System.out.println(accountService.getEmployeeName());
		System.out.println(accountService.getEmployeeNumber());
		System.out.println(accountService.getName());
		
		
		/*
		FindtheLogic accountService2 = contextflaflankl.getBean("studentbean", FindtheLogic.class);
	
		System.out.println(accountService2.getEmployeeName());
		System.out.println(accountService2.getEmployeeNumber());*/
	}

}
