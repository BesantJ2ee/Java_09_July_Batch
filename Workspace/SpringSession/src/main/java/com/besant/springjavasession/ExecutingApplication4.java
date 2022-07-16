package com.besant.springjavasession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ExecutingApplication4 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\hp\\Downloads\\Beans4.xml";

		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		FindtheLogic accountService = context.getBean("studentbean", FindtheLogic.class);
		accountService.setEmployeeName("fsfs");
		accountService.setEmployeeNumber(3425235);  
		System.out.println(accountService.getEmployeeName());
		System.out.println(accountService.getEmployeeNumber());
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
