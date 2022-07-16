package com.besant.springjavasession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ExecutingApplication6 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\hp\\Downloads\\Bean6.xml";

		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		Employee accountService = context.getBean("studentbean", Employee.class);
		
		System.out.println(accountService.getEmpName());
		System.out.println(accountService.getAddress().getCountry());

	}

}
